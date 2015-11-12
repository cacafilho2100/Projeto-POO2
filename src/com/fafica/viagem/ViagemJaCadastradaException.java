package com.fafica.viagem;

public class ViagemJaCadastradaException extends Exception{
	public ViagemJaCadastradaException(){
		super("Viagem Já Cadastrada");
	}
	
	public ViagemJaCadastradaException(String msg){
		super("Viagem" + msg + "Já Cadastrada");
		
	}

}
