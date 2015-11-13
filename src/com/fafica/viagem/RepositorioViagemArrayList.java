package com.fafica.viagem;

import java.util.ArrayList;

public class RepositorioViagemArrayList implements IRepositorioViagem {

	

	private ArrayList<Viagem> arrayListViagem;
	private int id;
	
	public RepositorioViagemArrayList(){
		
		arrayListViagem = new ArrayList<Viagem>();
		id = 0;	
	}
	

	public void cadastrar(Viagem viagem) throws ViagemJaCadastradaException {
		if(!existe(viagem.getIdViagem())){
		//viagem.setIdViagem(id);
		arrayListViagem.add(viagem);
	    id++;
	    System.out.println("viagem cadastrada com sucesso");
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
				arrayListViagem.add(viagem1);
			}
		}
	}

	
	  public boolean remover(Integer idViagem) throws ViagemNaoEncontradaException{
	    for(Viagem viagem : arrayListViagem){
		   if(viagem.getIdViagem() == idViagem){
			   arrayListViagem.remove(viagem);
			   System.out.println("Viagem Removida Com Sucesso");
		       return true;		   
		   }   
	    }
	    throw new ViagemNaoEncontradaException();
		 
	}
	

	
	public Viagem procurar(Integer idViagem)throws ViagemNaoEncontradaException {
		for(Viagem viagem : arrayListViagem){
			if(viagem.getIdViagem() == idViagem){
				return viagem;	
			}
	
		}
		throw new ViagemNaoEncontradaException("viagem não Encontrado");

		
	}


	public boolean existe(Integer idViagem){
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
