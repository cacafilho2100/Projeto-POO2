package com.fafica.viagem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.fafica.motorista.Motorista;


public class RepositorioViagemMap implements IRepositorioViagem {

	private Map<Integer, Viagem> viagemMap;

	
	public RepositorioViagemMap(){
		
		viagemMap = new HashMap<>();
		
		
	}
	
	public void cadastrar(Viagem viagem) throws ViagemJaCadastradaException {
		if(!existe(viagem.getIdViagem())){
			viagemMap.put(viagem.getIdViagem(), viagem);
			System.out.println("Viagem cadastrada com sucesso");
		}else{
		throw new ViagemJaCadastradaException();
		}
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
		if(!existe(idViagem)){
			throw new ViagemNaoEncontradaException();
			
		}
		else{
			viagemMap.remove(idViagem);
			return true;
		}
	}

	
	public Viagem procurar(int idViagem) throws ViagemNaoEncontradaException {
	     if(!existe(idViagem)){
	    	 throw new ViagemNaoEncontradaException();
	     }
	     else{
	    	 return viagemMap.get(idViagem);
	    	 
	     }
   	
	}

	
	public boolean existe(int idViagem) {
		if(viagemMap.containsKey(idViagem)){
			return true;
		}
		return false;

		}
			
	

	public ArrayList<Viagem> listar() {
		
		ArrayList<Viagem> lista = new ArrayList<Viagem>();
		Set<Integer> chave = viagemMap.keySet();
 		for(Integer key : chave){
 			lista.add(viagemMap.get(key)); 
	      }
 		return lista;
	}
}
