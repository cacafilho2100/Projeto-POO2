package com.fafica.fachada;

import java.util.ArrayList;

import com.fafica.fornecedor.ControladorFornecedor;

public class Fachada{
	
	private static Fachada instance;
	private ControladorFornecedor controladorFornecedor;
	
	
	private Fachada() {
		this.controladorFornecedor = new ControladorFornecedor();
		
	}
}
