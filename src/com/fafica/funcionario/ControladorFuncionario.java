package com.fafica.funcionario;

import java.util.ArrayList;

import com.fafica.util.CampoObrigatorioInvalidoException;
import com.fafica.util.ValidarCPF;

public class ControladorFuncionario {
	
	private IRepositorioFuncionario repositorioFuncionario;
	
	
	public ControladorFuncionario(){
		this.repositorioFuncionario = new RepositorioFuncionarioArrayList();
	}
	
	public void cadastrar(Funcionario funcionario)throws IllegalArgumentException,CPFInvalidoException,FuncionarioJaCadastradoException,CampoObrigatorioInvalidoException{
		if(!ValidarCPF.validaCPF(funcionario.getCpfFuncionario())){ 
			throw new CPFInvalidoException(funcionario.getCpfFuncionario());
		}
		if(funcionario == null){
			throw new IllegalArgumentException("Cliente Invalido");
		}
		if(funcionario.getNomeFuncionario().equals(" ")){
			throw new CampoObrigatorioInvalidoException("Nome");
		}
		
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



