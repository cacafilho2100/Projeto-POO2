package com.fafica.funcionario;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fafica.util.CampoObrigatorioInvalidoException;
import com.fafica.util.ValidarCPF;

public class ControladorFuncionario {
	
	private IRepositorioFuncionario repositorioFuncionario;
	
	
	public ControladorFuncionario() throws ClassNotFoundException, SQLException{
		//this.repositorioFuncionario = new RepositorioFuncionarioArrayList();
		//this.repositorioFuncionario = new RepositorioFuncionarioMap();
		//this.repositorioFuncionario = new RepositorioFuncionarioSet();
		this.repositorioFuncionario = new RepositorioFuncionarioBd();
		//this.repositorioFuncionario = new RepositorioFuncionarioIO();
	}
	
	public void cadastrar(Funcionario funcionario)throws IllegalArgumentException,CPFInvalidoException,FuncionarioJaCadastradoException,CampoObrigatorioInvalidoException, SQLException, IOException, FuncionarioNaoEncontradoException{
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
	
	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException, CPFInvalidoException, CampoObrigatorioInvalidoException, SQLException, IOException{
		if(!ValidarCPF.validaCPF(funcionario.getCpfFuncionario())){
			throw new CPFInvalidoException(funcionario.getCpfFuncionario());
		}
		if(funcionario.getCpfFuncionario().equals(" ")){
			throw new CampoObrigatorioInvalidoException();
		}
		repositorioFuncionario.atualizar(funcionario);
	}
	
	public Boolean existe(String cpfFuncionario) throws FuncionarioNaoEncontradoException, IOException{
		return repositorioFuncionario.existe(cpfFuncionario);
	}
	
	public void remover (String cpfFuncionario)throws CPFInvalidoException, CampoObrigatorioInvalidoException, FuncionarioNaoEncontradoException, SQLException, IOException{

		if(cpfFuncionario == cpfFuncionario){
		repositorioFuncionario.remover(cpfFuncionario);
		}else{throw new CPFInvalidoException(cpfFuncionario);}
	}
	
	public Funcionario procurar(String cpfFuncionario)  throws FuncionarioNaoEncontradoException, CPFInvalidoException, SQLException, IOException{
		if(cpfFuncionario == cpfFuncionario){
			return repositorioFuncionario.procurar(cpfFuncionario);
			}
			throw new CPFInvalidoException(cpfFuncionario);
	}
	
	public ArrayList<Funcionario> listar() throws SQLException, IOException{
		return repositorioFuncionario.listar();
	}
	
	

}



