package com.fafica.viagem;

import java.util.ArrayList;

public class RepositorioViagemArrayList implements IRepositorioViagem {

	

	private ArrayList<Viagem> arrayListViagem;
	private int id;
	
	public RepositorioViagemArrayList(){
		
		arrayListViagem = new ArrayList<Viagem>();
			
	}
	

	public void cadastrar(Viagem viagem) throws ViagemJaCadastradaException {
		if(!existe(viagem.getIdViagem())){
		arrayListViagem.add(viagem);
	    
		}else{
			throw new ViagemJaCadastradaException();
		  }
		}
	

	
	public void atualizar(Viagem viagem) throws ViagemNaoEncontradaException {
		if(!existe(viagem.getIdViagem())){
			throw new ViagemNaoEncontradaException();
		}
		for(Viagem viagem1 : arrayListViagem){
			if((viagem1.getIdViagem() == viagem1.getIdViagem())){
				arrayListViagem.remove(viagem1);
				arrayListViagem.add(viagem);
			}
		}
	}

	
	  public boolean remover(int idViagem) throws ViagemNaoEncontradaException{
	    for(Viagem viagem : arrayListViagem){
		   if(viagem.getIdViagem() == idViagem){
			   arrayListViagem.remove(viagem);
			   System.out.println("Viagem Removida Com Sucesso");
		       return true;		   
		   }   
	    }
	    throw new ViagemNaoEncontradaException();
		 
	}
	

	
	public Viagem procurar(int idViagem)throws ViagemNaoEncontradaException {
		for(Viagem viagem : arrayListViagem){
			if(viagem.getIdViagem() == idViagem){
				return viagem;	
			}
	
		}
		throw new ViagemNaoEncontradaException("viagem não Encontrado");

		
	}


	public boolean existe(int idViagem){
		for (Viagem viagem : arrayListViagem) {
			if(idViagem == viagem.getIdViagem()){
				
	          	return true;
	         }
			
		}
		return false;
	
	}

	@Override
	public ArrayList<Viagem> listar() {
	
		
		return arrayListViagem;
	}

}
