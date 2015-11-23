package com.fafica.veiculo;

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

import com.fafica.funcionario.Funcionario;

public class RepositorioVeiculoIO implements IRepositorioVeiculo {
	
	Path path = Paths.get("C:/Users/Cristiano/git/Projeto-POO2/VeiculoIO/Veiculo.txt");
	Charset utf8 = StandardCharsets.UTF_8;
	private ArrayList<Veiculo> list;
	
	public RepositorioVeiculoIO(){
		list = new ArrayList<Veiculo>();
	}
	
	public void armazenarVeiculo(Veiculo veiculo) throws IOException{
		try(BufferedWriter escrever = Files.newBufferedWriter(path,utf8,StandardOpenOption.APPEND)){
			escrever.write(veiculo.getidVeiculo()+ ";" +veiculo.getModelo()+ ";" +veiculo.getChassi()+ ";" +veiculo.getCor()+ ";"
							+veiculo.getPlaca()+ ";" +veiculo.getQuantPassageiro()+ ";" +veiculo.getAno());
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void armazenarVeiculoArray(ArrayList<Veiculo> list) throws IOException{
		try(BufferedWriter escrever = Files.newBufferedWriter(path, utf8)){
			for(Veiculo veiculo : list){
				escrever.write(veiculo.getidVeiculo()+ ";" +veiculo.getChassi()+ ";" +veiculo.getPlaca()+ ";" +veiculo.getModelo()+ ";"
								+veiculo.getQuantPassageiro()+ ";" +veiculo.getCor()+ ";" +veiculo.getAno());
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public ArrayList<Veiculo> recuperandoDados() throws IOException{
		ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
		try(BufferedReader ler = Files.newBufferedReader(path, utf8)){
			String line = null;
			while((line = ler.readLine()) != null){
				String [] m = line.split(";");
				Veiculo veiculo = new Veiculo(Integer.parseInt(m[0]),(m[1]), m[2], m[3], m[4], m[5], (m[6]));
				lista.add(veiculo);
			}
		}catch(IOException e){
			System.out.println("erro IOException");
		}
		return lista;
	}
	

	@Override
	public void cadastrar(Veiculo veiculo) throws VeiculoJaCadastradoException, SQLException {
		
		
	}

	@Override
	public void atualizar(Veiculo veiculo) throws VeiculoNaoEncontradoException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Integer idVeiculo) throws VeiculoNaoEncontradoException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Veiculo procurar(Integer idVeiculo) throws VeiculoNaoEncontradoException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(Integer idVeiculo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Veiculo> listar() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
