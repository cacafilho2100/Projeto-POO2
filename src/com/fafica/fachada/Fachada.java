package com.fafica.fachada;

import java.util.ArrayList;

import com.fafica.fornecedor.ControladorFornecedor;
import com.fafica.funcionario.ControladorFuncionario;
import com.fafica.funcionario.Funcionario;

public class Fachada{
	
	private static Fachada instance;
	private ControladorFornecedor controladorFornecedor;
	private ControladorFuncionario controladorFuncionario;
	
	
	private Fachada() {
		this.controladorFornecedor = new ControladorFornecedor();
		this.controladorFuncionario = new ControladorFuncionario();
		
	}
	
	public static Fachada getInstance(){
		if(Fachada.instance == null){
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	//motodos de funcionario
	public void cadastrarFuncionario(Funcionario funcionario){
		controladorFuncionario.cadastrar(funcionario);
	}
	
	public void atualizarFuncionario(Funcionario funcionario){
		controladorFuncionario.atualizar(funcionario);
	}
	
	public Boolean existeFuncionario(String cpfFuncionario){
		return controladorFuncionario.existe(cpfFuncionario);
	}
	
	public void remorverFuncionario(String cpfFuncionario){
		controladorFuncionario.remover(cpfFuncionario);
		
	}
	
	public Funcionario procurarFuncionario(String cpfFuncionario){
		return controladorFuncionario.procurar(cpfFuncionario);
	}
	
	public ArrayList<Funcionario> listarFuncionario(){
		return controladorFuncionario.listar();
	}
}
