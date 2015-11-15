package com.fafica.veiculo;

public class VeiculoJaCadastradoException extends Exception {
	
	public VeiculoJaCadastradoException(){
		super("Veiculo ja Cadastrado");
	}
	
	public VeiculoJaCadastradoException(String msg){
		super ("Veiculo "+msg+" ja Cadastrado");
	}

}
