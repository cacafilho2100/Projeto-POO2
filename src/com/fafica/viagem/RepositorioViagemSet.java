package com.fafica.viagem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;



public class RepositorioViagemSet implements IRepositorioViagem {
	
	private Set<Viagem> viagemSet;
	
	
	
	public RepositorioViagemSet(){
		
		viagemSet = new HashSet<>();
	}
	
	public void cadastrar(Viagem viagem) throws ViagemJaCadastradaException {
		if(!existe(viagem.getIdViagem())){
			viagemSet.add(viagem);
	    
		}else{
			throw new ViagemJaCadastradaException();
		  }
		}
	

	
	public void atualizar(Viagem viagem) throws ViagemNaoEncontradaException {
		if(!existe(viagem.getIdViagem())){
			throw new ViagemNaoEncontradaException();
		}
		for(Viagem viagem1 : viagemSet){
			if((viagem1.getIdViagem() == viagem1.getIdViagem())){
				viagemSet.remove(viagem1);
				viagemSet.add(viagem);
			}
		}
	}

	
	  public boolean remover(int idViagem) throws ViagemNaoEncontradaException{
	    for(Viagem viagem : viagemSet){
		   if(viagem.getIdViagem() == idViagem){
			   viagemSet.remove(viagem);
			   System.out.println("Viagem Removida Com Sucesso");
		       return true;		   
		   }   
	    }
	    throw new ViagemNaoEncontradaException();
		 
	}
	

	
	public Viagem procurar(int idViagem)throws ViagemNaoEncontradaException {
		for(Viagem viagem : viagemSet){
			if(viagem.getIdViagem() == idViagem){
				return viagem;	
			}
	
		}
		throw new ViagemNaoEncontradaException("viagem não Encontrado");

		
	}


	public boolean existe(int idViagem){
		for (Viagem viagem : viagemSet) {
			if(idViagem == viagem.getIdViagem()){
				
	          	return true;
	         }
			
		}
		return false;
	
	}

	@Override
	public ArrayList<Viagem> listar() {
	
		
		return null;
	}

	
	
	
}
