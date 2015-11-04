package com.fafica.funcionario;

import java.util.ArrayList;

public interface IRepositorioFuncionario {
	
	public void cadastrar(Funcionario funcionario);
	public void atualizar(Funcionario funcionario);
	public boolean remover(String cpfFuncionario);
	public Funcionario procurar(String cpfFunionario);
	public boolean existe(String cpfFuncionario);
	public ArrayList<Funcionario>listar();
	
	
	
	

}
