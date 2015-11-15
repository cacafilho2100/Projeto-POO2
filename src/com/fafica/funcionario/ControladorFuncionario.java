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
	
	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException, CPFInvalidoException, CampoObrigatorioInvalidoException{
		if(!ValidarCPF.validaCPF(funcionario.getCpfFuncionario())){
			throw new CPFInvalidoException(funcionario.getCpfFuncionario());
		}
		if(funcionario.getCpfFuncionario().equals(" ")){
			throw new CampoObrigatorioInvalidoException();
		}
		repositorioFuncionario.atualizar(funcionario);
	}
	
	public Boolean existe(String cpfFuncionario) throws FuncionarioNaoEncontradoException{
		return repositorioFuncionario.existe(cpfFuncionario);
	}
	
	public void remover (String cpfFuncionario)throws CPFInvalidoException, CampoObrigatorioInvalidoException, FuncionarioNaoEncontradoException{

		if(cpfFuncionario == cpfFuncionario){
		repositorioFuncionario.remover(cpfFuncionario);
		}else{throw new CPFInvalidoException(cpfFuncionario);}
	}
	
	public Funcionario procurar(String cpfFuncionario)  throws FuncionarioNaoEncontradoException, CPFInvalidoException{
		if(cpfFuncionario == cpfFuncionario){
			return repositorioFuncionario.procurar(cpfFuncionario);
			}
			throw new CPFInvalidoException(cpfFuncionario);
	}
	
	public ArrayList<Funcionario> listar(){
		return repositorioFuncionario.listar();
	}
	
	

}



