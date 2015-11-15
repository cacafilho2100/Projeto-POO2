package com.fafica.veiculo;

public class VeiculoNaoEncontradoException extends Exception {
	
	public VeiculoNaoEncontradoException(){
		super("veiculo nao Encontrado");
	}
	
	public VeiculoNaoEncontradoException(String mesg){
		super("Veiculo "+mesg+" nao encontrado");
	}

}
