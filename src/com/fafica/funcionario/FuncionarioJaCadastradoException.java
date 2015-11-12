package com.fafica.funcionario;

public class FuncionarioJaCadastradoException extends Exception {
	
	public FuncionarioJaCadastradoException(){
		super ("Funcionario Ja Cadastrado");
	}
	
	public FuncionarioJaCadastradoException(String msg){
		super ("Funcionario "+msg+" ja Cadastrado");
	}

}
