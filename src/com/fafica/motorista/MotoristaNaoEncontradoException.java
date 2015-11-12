package com.fafica.motorista;

public class MotoristaNaoEncontradoException extends Exception {
	
	public MotoristaNaoEncontradoException(){
		super("Motorista N�o Encontrado =( ");
	}
	
	public MotoristaNaoEncontradoException(String msg){
        super ("Motorista " + msg + " N�o Encontrado");
    }
	
}
