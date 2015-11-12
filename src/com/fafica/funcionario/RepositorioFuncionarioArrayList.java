package com.fafica.funcionario;

import java.util.ArrayList;

public class RepositorioFuncionarioArrayList implements IRepositorioFuncionario {
	
	private ArrayList<Funcionario> funcionarioArrayList;
	private Integer id;
	
	public RepositorioFuncionarioArrayList(){
		funcionarioArrayList = new ArrayList<Funcionario>();
		id = 1;
	}

	@Override
	public void cadastrar(Funcionario funcionario) {
		funcionario.setIdFuncionario(this.id);
		funcionarioArrayList.add(funcionario);
		id++;
		
	}

	@Override
	public void atualizar(Funcionario funcionario) {
		
		
	}

	@Override
	public boolean remover(String cpfFuncionario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Funcionario procurar(String cpfFunionario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(String cpfFuncionario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Funcionario> listar() {
	
		return funcionarioArrayList;
	}

}
