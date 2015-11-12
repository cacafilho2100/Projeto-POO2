package com.fafica.funcionario;

public class FuncionarioNaoEncontradoException extends Exception {
	
	public FuncionarioNaoEncontradoException(){
		super ("Funcionario n�o encontrado!");
	}
	
	public FuncionarioNaoEncontradoException(String msg){
		super ("Funcionario "+msg+" n�o encontrado");
	}
	
	

}
