package com.fafica.funcionario;

public class CampoInvalidoException extends Exception {

	public CampoInvalidoException(String msg){
		super ("campo "+msg+" nulo ou invalido");
	}
}
