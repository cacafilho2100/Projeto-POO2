package com.fafica.util;

public class CampoObrigatorioInvalidoException extends Exception {
	
	public CampoObrigatorioInvalidoException(){
		super("O campo � invalido ou nulo.");
	}
	
	public CampoObrigatorioInvalidoException(String msg){
		super("O campo " + msg + " � nulo ou inv�lido.");
		
	}

}
