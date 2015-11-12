package com.fafica.util;

public class CampoObrigatorioInvalidoException extends Exception {
	
	public CampoObrigatorioInvalidoException(){
		super("O campo é invalido ou nulo.");
	}
	
	public CampoObrigatorioInvalidoException(String msg){
		super("O campo " + msg + " é nulo ou inválido.");
		
	}

}
