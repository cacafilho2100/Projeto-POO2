package com.fafica.funcionario;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class RepositorioFuncionarioMap implements IRepositorioFuncionario {
	
	Map<Integer, Funcionario> funcionarioMap;
	int index;
	
	public RepositorioFuncionarioMap(){
		funcionarioMap = new TreeMap<Integer, Funcionario>();
		index = 1;
	}

	@Override
	public void cadastrar(Funcionario funcionario) throws FuncionarioJaCadastradoException {
		if(!existe(funcionario.getCpfFuncionario())){
			funcionario.setIdFuncionario(index);
			funcionarioMap.put(index, funcionario);
			index++;
		}else {throw new FuncionarioJaCadastradoException();}
		
	}

	@Override
	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException {
		Integer i = funcionario.getIdFuncionario();
		funcionarioMap.put(i, funcionario);
		if(!existe(funcionario.getCpfFuncionario())){
			throw new FuncionarioNaoEncontradoException(); 
		}
		
	}

	@Override
	public void remover(String cpfFuncionario) {
		for(int i = 0; i < funcionarioMap.size();i++){
			Funcionario funcionario = funcionarioMap.get(i);
			if(cpfFuncionario == funcionario.getCpfFuncionario()){
				funcionarioMap.remove(funcionario);
			}
		}
		
	}

	@Override
	public Funcionario procurar(String cpfFuncionario) throws FuncionarioNaoEncontradoException {
		for(int i = 0; i < funcionarioMap.size();i++){
			Funcionario funcionario = funcionarioMap.get(i);
			if(cpfFuncionario == funcionario.getCpfFuncionario()){
				return funcionario;
			}
		}
		throw new FuncionarioNaoEncontradoException();
	}

	@Override
	public boolean existe(String cpfFuncionario) {
		for(int i = 0; i < funcionarioMap.size();i++){
			Funcionario funcionario = funcionarioMap.get(i);
			if(cpfFuncionario == funcionario.getCpfFuncionario()){
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Funcionario> listar() {
		ArrayList<Funcionario> arrayListFuncionario = new ArrayList<Funcionario>();
		for(int i = 0;i< funcionarioMap.size();i++){
			Funcionario funcionario = funcionarioMap.get(i);
			arrayListFuncionario.add(funcionario);
		}
		return arrayListFuncionario;
	}

}
