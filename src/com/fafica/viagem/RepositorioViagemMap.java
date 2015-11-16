package com.fafica.viagem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RepositorioViagemMap implements IRepositorioViagem {

	private Map<Integer, Viagem> viagemMap;

	
	public RepositorioViagemMap(){
		
		viagemMap = new TreeMap<Integer, Viagem>();
		
		
	}
	
	public void cadastrar(Viagem viagem) throws ViagemJaCadastradaException {
		if(existe(viagem.getIdViagem()))throw new ViagemJaCadastradaException();
		viagemMap.put(viagem.getIdViagem(), viagem);
		//System.out.println("Viagem cadastrada com sucesso");
		
	}
	

	public void atualizar(Viagem viagem) throws ViagemNaoEncontradaException {
		if(existe(viagem.getIdViagem())){
			viagemMap.remove(viagem.getIdViagem());
			viagemMap.put(viagem.getIdViagem(), viagem);
		}else{
			throw new ViagemNaoEncontradaException();
				
		}	
		
	}

	
	public boolean remover(int idViagem) throws ViagemNaoEncontradaException {
		if(existe(idViagem)){
			viagemMap.remove(idViagem);
			return true;
		}
		else{
			throw new ViagemNaoEncontradaException();	
		}	
	}

	
	public Viagem procurar(int idViagem) throws ViagemNaoEncontradaException {
	     if(existe(idViagem)){
	    	 return viagemMap.get(idViagem);
	     }
	     else{
	    	 throw new ViagemNaoEncontradaException();
	     }
   	
	}

	
	public boolean existe(int idViagem) {
		for (int i = 0; i < viagemMap.size(); i++) {
			Viagem viagem = viagemMap.get(i);
			if(idViagem == viagem.getIdViagem()){
				
			return true;	
				 }
			}
		
			return false;
		}
			
	

	
	public ArrayList<Viagem> listar() {
		ArrayList<Viagem> arrayListViagem = new ArrayList<Viagem>();
			for (Viagem viagem : arrayListViagem) {
				arrayListViagem.add(viagem);
			}
			return arrayListViagem;
	}
		
	
}
