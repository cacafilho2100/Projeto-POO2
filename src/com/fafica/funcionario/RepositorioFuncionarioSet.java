package com.fafica.funcionario;

import java.util.ArrayList;
import java.util.TreeSet;

public class RepositorioFuncionarioSet implements IRepositorioFuncionario {
	TreeSet<Funcionario> funcionarioSet;
	int index;
	
	public RepositorioFuncionarioSet (){
		funcionarioSet = new TreeSet<Funcionario>();
		index = 1;
		index++;
	}
	
	

	@Override
	public void cadastrar(Funcionario funcionario) throws FuncionarioJaCadastradoException {
		if(!existe(funcionario.getCpfFuncionario())){
			funcionario.setIdFuncionario(index);
			funcionarioSet.add(funcionario);
		}else {throw new FuncionarioJaCadastradoException();}
		
	}

	@Override
	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException {
		for(Funcionario funcionario1 : funcionarioSet){
			if(funcionario1.getCpfFuncionario() == funcionario.getCpfFuncionario()){
				funcionarioSet.remove(funcionario1);
				funcionarioSet.add(funcionario);
			}
			
			if(!existe(funcionario.getCpfFuncionario())){
				throw new FuncionarioNaoEncontradoException();
			}
		}
		
	}

	@Override
	public void remover(String cpfFuncionario) {
		for(Funcionario funcionario : funcionarioSet){
			if(cpfFuncionario == funcionario.getCpfFuncionario()){
				funcionarioSet.remove(funcionario);
			}
		}
		
	}

	@Override
	public Funcionario procurar(String cpfFuncionario) throws FuncionarioNaoEncontradoException {
		for(Funcionario funcionario : funcionarioSet){
			if(cpfFuncionario == funcionario.getCpfFuncionario()){
				return funcionario;
			}
		}
	  throw new FuncionarioNaoEncontradoException();
	}

	@Override
	public boolean existe(String cpfFuncionario)  {
		for(Funcionario funcionario : funcionarioSet){
			if(cpfFuncionario == funcionario.getCpfFuncionario()){
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Funcionario> listar() {
		ArrayList<Funcionario> arrayFuncionario = new ArrayList<Funcionario>();
		for(Funcionario funcionario : funcionarioSet){
			arrayFuncionario.add(funcionario);
		}
		return arrayFuncionario;
	}

}
