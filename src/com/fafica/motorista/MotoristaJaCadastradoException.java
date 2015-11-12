package com.fafica.motorista;

public class MotoristaJaCadastradoException extends Exception {
	
	public MotoristaJaCadastradoException(){
		super("Motorista já Cadastrado");
	}
	
	public MotoristaJaCadastradoException(String msg){
        super ("Motorista " + msg + " já cadastrado!");
    }

}
