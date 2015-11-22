package com.fafica.viagem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;



public class RepositorioViagemIO implements IRepositorioViagem {
	
	Path path = Paths.get("C:/Users/Ribeiro/git/Projeto-POO2/ViagemIO/viagem.txt");
	Charset utf8 = StandardCharsets.UTF_8;
	private ArrayList<Viagem> viagemArrayList;

	
public  RepositorioViagemIO(){
		
	viagemArrayList = new ArrayList<Viagem>();
		
	}
	
	public void armazenarViagem(Viagem viagem){
		try( BufferedWriter writer = Files.newBufferedWriter(path, utf8, StandardOpenOption.APPEND)){
				writer.write(viagem.getIdViagem() + ";" + viagem.getDestino()+ ";" + viagem.getCusto() + ";" 
			+ viagem.getData() +"\r\n"); 
		 }catch(IOException e){
			 e.printStackTrace(); 
		 }			
	}
	
	
	public void  armazenarViagemArray(ArrayList<Viagem> viagemArrayList){
		try(BufferedWriter writer = Files.newBufferedWriter(path, utf8) ){
			for(Viagem viagem :viagemArrayList){
				writer.write(viagem.getIdViagem() + ";" + viagem.getDestino()+ ";" + viagem.getCusto() + ";" 
						+ viagem.getData() +"\r\n");
			  }	
			}catch(IOException e){
				System.out.println("Erro IOException ");
				
			}
	}
	
	public ArrayList<Viagem> recuperaDados(){
		ArrayList<Viagem> viagemReader = new ArrayList<Viagem>();
		try(BufferedReader reader = Files.newBufferedReader(path, utf8) ){
			String line = null;
			while((line = reader.readLine()) != null){
				String [] m = line.split(";");
				Viagem viagem = new Viagem(Integer.parseInt(m[0]), m[1], m[2], m[3]);
				viagemReader.add(viagem);
			}
		}catch(IOException e){
			System.out.println("Erro IOException ");
			
		}
		return viagemReader;
	
	}

	

	public void cadastrar(Viagem viagem) throws ViagemJaCadastradaException{
		if(!existe(viagem.getIdViagem())){
			armazenarViagem(viagem);
			System.out.println("Viagem cadastrada");
		}else	throw new ViagemJaCadastradaException();		
	}
		
	

	
	

	public void atualizar(Viagem viagem) throws ViagemNaoEncontradaException {
		viagemArrayList = recuperaDados();
		if(existe(viagem.getIdViagem())){
			Viagem viagemNull = null;
			for(Viagem viagem1 : viagemArrayList){
		if(viagem1.getIdViagem() == viagem.getIdViagem()){
			viagemNull = viagem1;
		  }
		}
			viagemArrayList.remove(viagemNull);
			viagemArrayList.add(viagem);
			armazenarViagemArray(viagemArrayList);
			System.out.println("Viagem Atulizada Com Sucesso");
	 }
		throw new ViagemNaoEncontradaException();
					
	}

	
	public boolean remover(int idViagem) throws ViagemNaoEncontradaException {
		viagemArrayList = recuperaDados();
		if(existe(idViagem)){
			Viagem viagemRemover = null;
			for(Viagem viagem1 : viagemArrayList){
		if(viagem1.getIdViagem()== idViagem){
			viagemRemover = viagem1;
		  }
		}
			viagemArrayList.remove(viagemRemover);
			armazenarViagemArray(viagemArrayList);
			System.out.println("Viagem Removida Com Sucesso");
			return true;
		
	 }
		throw new ViagemNaoEncontradaException();			
	}
		
		
	
	@Override
	public Viagem procurar(int idViagem) throws ViagemNaoEncontradaException {
		if(!existe(idViagem)){
			throw new ViagemNaoEncontradaException();
		}
		viagemArrayList = recuperaDados();
		Viagem ViagemP = null;
		for(Viagem viagem1 : viagemArrayList){
			if(viagem1.getIdViagem() == idViagem){
				ViagemP = viagem1;
			}
		}
		return ViagemP;
	}


	
	
	public boolean existe(int idViagem) {
		viagemArrayList = recuperaDados();
		for(Viagem viagem1 : viagemArrayList){
			if(viagem1.getIdViagem() == idViagem){
				return true;
			}
		}
		return false;
	}

	
	public ArrayList<Viagem> listar() {
		viagemArrayList = recuperaDados();
		return viagemArrayList;
		
	}

 }


