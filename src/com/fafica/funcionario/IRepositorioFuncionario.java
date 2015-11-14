package com.fafica.funcionario;

import java.util.ArrayList;

public interface IRepositorioFuncionario {
	
	public void cadastrar(Funcionario funcionario) throws FuncionarioJaCadastradoException;
	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException ;
	public void remover(String cpfFuncionario);
	public Funcionario procurar(String cpfFuncionario) throws FuncionarioNaoEncontradoException;
	public boolean existe(String cpfFuncionario) throws FuncionarioNaoEncontradoException;
	public ArrayList<Funcionario>listar();
	
	
	
	

}
