package com.fafica.viagem;

public class ViagemJaCadastradaException extends Exception{
	public ViagemJaCadastradaException(){
		super("Viagem J� Cadastrada");
	}
	
	public ViagemJaCadastradaException(String msg){
		super("Viagem" + msg + "J� Cadastrada");
		
	}

}
