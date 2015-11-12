package com.fafica.motorista;

public class MotoristaJaCadastradoException extends Exception {
	
	public MotoristaJaCadastradoException(){
		super("Motorista j� Cadastrado");
	}
	
	public MotoristaJaCadastradoException(String msg){
        super ("Motorista " + msg + " j� cadastrado!");
    }

}
