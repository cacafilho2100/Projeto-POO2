package com.fafica.funcionario;

public class FuncionarioNaoEncontradoException extends Exception {
	
	public FuncionarioNaoEncontradoException(){
		super ("Funcionario não encontrado!");
	}
	
	public FuncionarioNaoEncontradoException(String msg){
		super ("Funcionario "+msg+" não encontrado");
	}
	
	

}
