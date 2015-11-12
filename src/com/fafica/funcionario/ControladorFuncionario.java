package com.fafica.funcionario;

import java.util.ArrayList;

public class ControladorFuncionario {
	
	private IRepositorioFuncionario repositorioFuncionario;
	
	
	public ControladorFuncionario(){
		this.repositorioFuncionario = new RepositorioFuncionarioArrayList();
	}
	
	public void cadastrar(Funcionario funcionario)throws IllegalArgumentException,CPFInvalidoException,FuncionarioJaCadastradoException,CampoInvalidoException{
		repositorioFuncionario.cadastrar(funcionario);
	}
	
	public void atualizar(Funcionario funcionario){
		repositorioFuncionario.atualizar(funcionario);
	}
	
	public Boolean existe(String cpfFuncionario){
		return repositorioFuncionario.existe(cpfFuncionario);
	}
	
	public void remover (String cpfFuncionario){
		repositorioFuncionario.remover(cpfFuncionario);
	}
	
	public Funcionario procurar(String cpfFuncionario){
		return repositorioFuncionario.procurar(cpfFuncionario);
	}
	
	public ArrayList<Funcionario> listar(){
		return repositorioFuncionario.listar();
	}
	
	

}



