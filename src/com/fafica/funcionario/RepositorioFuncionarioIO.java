package com.fafica.funcionario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLException;
import java.util.ArrayList;



public class RepositorioFuncionarioIO implements IRepositorioFuncionario {
	
	Path path = Paths.get("C:/Users/Cristiano/git/Projeto-POO2/FuncionarioIO/Funcionario.txt");
	Charset utf8 = StandardCharsets.UTF_8;
	private ArrayList<Funcionario> list;
	private Integer index;
	
	public RepositorioFuncionarioIO(){
		list = new ArrayList<Funcionario>();
		index = 1;
	
	}
	
	public void armazenarFuncionario(Funcionario funcionario) throws IOException{
		try(BufferedWriter escrever = Files.newBufferedWriter(path,utf8,StandardOpenOption.APPEND)){
			escrever.write(funcionario.getIdFuncionario()+ ";" +funcionario.getNomeFuncionario()+ ";" +funcionario.getEnderecoFuncionario()+ ";" +funcionario.getCpfFuncionario()+"\r\n;" 
							+funcionario.getEmailFuncionario()+ ";" +funcionario.getTelefoneFuncionario());
		}catch(IOException e){
			e.printStackTrace();
			//System.out.println("Erro");
		}
	}
	
	public void armazenarFuncionarioArray(ArrayList<Funcionario> list) throws IOException{
		try(BufferedWriter escrever = Files.newBufferedWriter(path, utf8)){
			for(Funcionario funcionario : list){
				escrever.write(funcionario.getIdFuncionario()+ ";" +funcionario.getNomeFuncionario()+ ";" +funcionario.getEnderecoFuncionario()+ ";" +funcionario.getCpfFuncionario()+ "\r\n;"
								+funcionario.getEmailFuncionario()+ ";" +funcionario.getTelefoneFuncionario());
			}
		}catch(IOException e){
			e.printStackTrace(); 
			//System.out.println("Erro");
		}
	}
	
	public ArrayList<Funcionario> recuperandoDados() throws IOException{
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		try(BufferedReader ler = Files.newBufferedReader(path, utf8)){
			String line = null;
			while((line = ler.readLine()) != null){
				String [] m = line.split(";");
				Funcionario funcionario = new Funcionario(Integer.parseInt(m[0]),m[1], m[2], m[3], m[4], m[5]);
				lista.add(funcionario);
			}
		}catch(IOException e){
			System.out.println("erro IOException");
		}
		return lista;
	}
	
	@Override
	public void cadastrar(Funcionario funcionario) throws FuncionarioJaCadastradoException, SQLException, IOException, FuncionarioNaoEncontradoException {
		if(!existe(funcionario.getCpfFuncionario())){
			funcionario.setIdFuncionario(index);
			armazenarFuncionario(funcionario);
			index++;
		}else{throw new FuncionarioJaCadastradoException();}
		
	}

	@Override
	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException, SQLException, IOException {
		list = recuperandoDados();
		if(existe(funcionario.getCpfFuncionario())){
			Funcionario funcionarionulo = null;
			for(Funcionario funcionario1 : list){
				if(funcionario1.getCpfFuncionario() == funcionario.getCpfFuncionario()){
					funcionarionulo = funcionario1;
				}
			}
			list.remove(funcionarionulo);
			list.add(funcionario);
			armazenarFuncionarioArray(list);
			System.out.println("foi atualizado com sucesso");
		}else{throw new FuncionarioNaoEncontradoException();}
		
	}

	@Override
	public void remover(String cpfFuncionario) throws FuncionarioNaoEncontradoException, SQLException, IOException {
		list = recuperandoDados();
		if(existe(cpfFuncionario)){
			Funcionario funcionarioRemover = null;
			for(Funcionario funcionario1 : list){
				if(funcionario1.getCpfFuncionario() == cpfFuncionario){
					funcionarioRemover = funcionario1;
		  }
		}
			list.remove(funcionarioRemover);
			armazenarFuncionarioArray(list);
			System.out.println("foi removido com sucesso");
		
	 }else{throw new FuncionarioNaoEncontradoException();}
		
	}

	@Override
	public Funcionario procurar(String cpfFuncionario) throws FuncionarioNaoEncontradoException, SQLException, IOException {
		if(!existe(cpfFuncionario)){
			throw new FuncionarioNaoEncontradoException();
		}
		list = recuperandoDados();
		Funcionario funcionariopro = null;
		for(Funcionario funcionariobus : list){
			if(funcionariobus.getCpfFuncionario() == cpfFuncionario){
				funcionariopro = funcionariobus;
			}
		}
		return funcionariopro;
	}

	@Override
	public boolean existe(String cpfFuncionario) throws FuncionarioNaoEncontradoException, IOException {
		list = recuperandoDados();
		for(Funcionario funcionario1 : list){
			if(funcionario1.getCpfFuncionario() == cpfFuncionario){
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Funcionario> listar() throws SQLException, IOException {
		list = recuperandoDados();
		return list;
		
	}

}
