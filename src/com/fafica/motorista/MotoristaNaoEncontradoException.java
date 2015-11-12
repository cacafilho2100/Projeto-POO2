package com.fafica.motorista;

public class MotoristaNaoEncontradoException extends Exception {
	
	public MotoristaNaoEncontradoException(){
		super("Motorista Não Encontrado =( ");
	}
	
	public MotoristaNaoEncontradoException(String msg){
        super ("Motorista " + msg + " Não Encontrado");
    }
	
}
