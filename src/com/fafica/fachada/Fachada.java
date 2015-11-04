package com.fafica.fachada;

import java.util.ArrayList;

public class Fachada<ControladorFornecedor, ControladorFuncionario, ControladorMotorista, ControladorVeiculo, ControladorViagem> {
	
	private static Fachada instance1;
	private ControladorFornecedor controladorFornecedor;
	private static Fachada instance2;
	private ControladorFuncionario controladorFuncionario;
	private static Fachada instance3;
	private ControladorMotorista controladorMotorista ;
	private static Fachada instance4;
	private ControladorVeiculo controladorVeiculo;
	private static Fachada instance5;
	private ControladorViagem controladorViagem;
	
	private Fachada() {
		controladorFornecedor = new ControladorFornecedor();
		//controladorFuncionario = new ControladorFuncionario();
		//controladorMotorista = new ControladorMotorista();
		//controladorVeiculo = new ControladorVeiculo();
		//controladorViagem = new ControladorViagem();
	}
}
