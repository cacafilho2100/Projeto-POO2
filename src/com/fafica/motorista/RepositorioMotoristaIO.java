package com.fafica.motorista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class RepositorioMotoristaIO implements IRepositorioMotorista {
	
	
    Path path = Paths.get("C:/Users/Ribeiro/git/Projeto-POO2/MotoristaIO/motorista.txt");
	Charset utf8 = StandardCharsets.UTF_8;
	private ArrayList<Motorista> motoristaArrayList;
	

	
public  RepositorioMotoristaIO(){
		
		motoristaArrayList = new ArrayList<Motorista>();
		
	}
	
	public void armazenarMotoristas(Motorista motorista){
		try( BufferedWriter writer = Files.newBufferedWriter(path, utf8, StandardOpenOption.APPEND)){
				writer.write(motorista.getIdMotorista() + ";" + motorista.getNomeMotorista() + ";" + motorista.getCpfMotorista() + ";" 
			+ motorista.getEnderecoMotorista() + ";" + motorista.getSalarioMotorista() + ";" + motorista.getTelefoneMotorista()+"\r\n"); 
		 }catch(IOException e){
			 System.out.println("Erro IOException ");
		 }			
	}

	
	public void  armazenarMotoristaArray(ArrayList<Motorista> motoristaArrayList){
		try(BufferedWriter writer = Files.newBufferedWriter(path, utf8) ){
			for(Motorista motorista : motoristaArrayList){
				writer.write(motorista.getIdMotorista() + ";" + motorista.getNomeMotorista() + ";" + motorista.getCpfMotorista() + ";" 
						+ motorista.getEnderecoMotorista() + ";" + motorista.getSalarioMotorista() + ";" + motorista.getTelefoneMotorista()+"\r\n");
			  }	
			}catch(IOException e){
				System.out.println("Erro IOException ");
				
			}
	}
	
	public ArrayList<Motorista> recuperaDados(){
		ArrayList<Motorista> motoristaReader = new ArrayList<Motorista>();
		try(BufferedReader reader = Files.newBufferedReader(path, utf8) ){
			String line = null;
			while((line = reader.readLine()) != null){
				String [] m = line.split(";");
				Motorista motorista = new Motorista(Integer.parseInt(m[0]), m[1], m[2], m[3], m[4], m[5]);
				motoristaReader.add(motorista);
			}
		}catch(IOException e){
			System.out.println("Erro IOException ");
			
		}
		return motoristaReader;
	
	}

	

	public void cadastrar(Motorista motorista) throws MotoristaJaCadastradoException{
		if(!existe(motorista.getIdMotorista())){
			armazenarMotoristas(motorista);
			System.out.println("Motorista cadastrado");
		}else	throw new MotoristaJaCadastradoException();		
	}
		
	

	
	public void atualizar(Motorista motorista) throws MotoristaNaoEncontradoException {
		motoristaArrayList = recuperaDados();
		if(existe(motorista.getIdMotorista())){
			Motorista motoristaNull = null;
			for(Motorista motorista1 : motoristaArrayList){
		if(motorista1.getIdMotorista() == motorista.getIdMotorista()){
			motoristaNull = motorista1;
		  }
		}
			motoristaArrayList.remove(motoristaNull);
			motoristaArrayList.add(motorista);
			armazenarMotoristaArray(motoristaArrayList);
			System.out.println("Motorista Atulizado Com Sucesso");
	 }
		throw new MotoristaNaoEncontradoException();
					
	}

	
	public boolean remover(int idMotorista) throws MotoristaNaoEncontradoException {
		motoristaArrayList = recuperaDados();
		if(existe(idMotorista)){
			Motorista motoristaRemover = null;
			for(Motorista motorista1 : motoristaArrayList){
		if(motorista1.getIdMotorista() == idMotorista){
			motoristaRemover = motorista1;
		  }
		}
			motoristaArrayList.remove(motoristaRemover);
			armazenarMotoristaArray(motoristaArrayList);
			System.out.println("Motorista Removido Com Sucesso");
			return true;
		
	 }
		throw new MotoristaNaoEncontradoException();			
	}
		
		
	
	@Override
	public Motorista procurar(int idMotorista) throws MotoristaNaoEncontradoException {
		if(!existe(idMotorista)){
			throw new MotoristaNaoEncontradoException();
		}
		motoristaArrayList = recuperaDados();
		Motorista motoristaP = null;
		for(Motorista motorista1 : motoristaArrayList){
			if(motorista1.getIdMotorista() == idMotorista){
				motoristaP = motorista1;
			}
		}
		return motoristaP;
	}


	
	
	public boolean existe(int idMotorista) {
		motoristaArrayList = recuperaDados();
		for(Motorista motorista1 : motoristaArrayList){
			if(motorista1.getIdMotorista() == idMotorista){
				return true;
			}
		}
		return false;
	}

	
	public ArrayList<Motorista> listar() {
		motoristaArrayList = recuperaDados();
		return motoristaArrayList;
		
	}

 }


