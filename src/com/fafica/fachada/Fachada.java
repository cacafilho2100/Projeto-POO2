package com.fafica.fachada;

import java.util.ArrayList;

import com.fafica.fornecedor.ControladorFornecedor;
import com.fafica.funcionario.CPFInvalidoException;
import com.fafica.funcionario.ControladorFuncionario;
import com.fafica.funcionario.Funcionario;
import com.fafica.funcionario.FuncionarioJaCadastradoException;
import com.fafica.util.CampoObrigatorioInvalidoException;
import com.fafica.veiculo.ControladorVeiculo;
import com.fafica.veiculo.Veiculo;

public class Fachada{
	
	private static Fachada instance;
	private ControladorFornecedor controladorFornecedor;
	private ControladorFuncionario controladorFuncionario;
	private ControladorVeiculo controladorVeiculo;
	
	
	private Fachada() {
		this.controladorFornecedor = new ControladorFornecedor();
		this.controladorFuncionario = new ControladorFuncionario();
		this.controladorVeiculo = new ControladorVeiculo();
	}
	
	public static Fachada getInstance(){
		if(Fachada.instance == null){
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	//motodos de funcionario
	public void cadastrarFuncionario(Funcionario funcionario) throws IllegalArgumentException, CPFInvalidoException, FuncionarioJaCadastradoException, CampoObrigatorioInvalidoException{
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
	
	//metodos Veiculos
	
	public void cadastrarVeiculo(Veiculo veiculo){
		controladorVeiculo.cadastrar(veiculo);
	}
	
	public void atualizarVeiculo(Veiculo veiculo){
		controladorVeiculo.atualizar(veiculo);
	}
	
	public Boolean existeVeiculo(Integer idVeiculo){
		return controladorVeiculo.existe(idVeiculo);
	}
	
	public void removerVeiculo(Integer idVeiculo){
		controladorVeiculo.remover(idVeiculo);
	}
	
	public Veiculo procurarVeiculo(Integer idVeiculo){
		return controladorVeiculo.procurar(idVeiculo);
	}
	
	public ArrayList<Veiculo> listarVeiculo(){
		return controladorVeiculo.listar();
	}
}
