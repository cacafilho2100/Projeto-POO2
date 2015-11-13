package com.fafica.viagem;

public class ViagemNaoEncontradaException extends Exception {
	
	  public ViagemNaoEncontradaException(){
		super("Viagem Não Encontrada");
	}
	
	public ViagemNaoEncontradaException(String msg){
	     super("Viagem Não Encontrada");
		
	}

}
