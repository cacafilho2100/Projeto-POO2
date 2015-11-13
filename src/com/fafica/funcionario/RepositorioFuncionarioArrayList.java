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
	public void cadastrar(Funcionario funcionario) throws FuncionarioJaCadastradoException {
		if(!existe(funcionario.getCpfFuncionario())){
		funcionario.setIdFuncionario(this.id);
		funcionarioArrayList.add(funcionario);
		id++;
		}else{ throw new FuncionarioJaCadastradoException();}
	}

	@Override
	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException{
		if(!existe(funcionario.getCpfFuncionario())){
			throw new FuncionarioNaoEncontradoException();
		}
		for(Funcionario funcionario1 : funcionarioArrayList){
			if((funcionario1.getCpfFuncionario() == funcionario.getCpfFuncionario()) || (funcionario1.getIdFuncionario() == funcionario.getIdFuncionario())){
				funcionarioArrayList.remove(funcionario1);
				funcionarioArrayList.add(funcionario);
			}
		}
		
		
	}

	@Override
	public void remover(String cpfFuncionario) {
		for(Funcionario funcionario : funcionarioArrayList){
			if(funcionario.getCpfFuncionario() == cpfFuncionario){
				funcionarioArrayList.remove(funcionario);
			}
		}
		
	}

	@Override
	public Funcionario procurar(String cpfFuncionario) throws FuncionarioNaoEncontradoException {
		for(Funcionario funcionario : funcionarioArrayList){
			if(funcionario.getCpfFuncionario() == cpfFuncionario){
				return funcionario;
			}else{throw new FuncionarioNaoEncontradoException("Funcionario nao Encontrado ou Nulo");}
		}
		return null;
	}

	@Override
	public boolean existe(String cpfFuncionario) {
		for(Funcionario funcionario : funcionarioArrayList){
			if(cpfFuncionario == funcionario.getCpfFuncionario()){
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Funcionario> listar() {
	
		return funcionarioArrayList;
	}

}
