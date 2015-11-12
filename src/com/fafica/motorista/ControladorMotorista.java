package com.fafica.motorista;
import java.util.ArrayList;

import com.fafica.util.CampoObrigatorioInvalidoException;


public class ControladorMotorista {
	
	private IRepositorioMotorista repositorioMotorista;
	
	
	public ControladorMotorista(){
		
		this.repositorioMotorista = new RepositorioMotoristaArrayList();
	}

	public void cadastrar(Motorista morista)throws MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException {
		
		
		
		
	}
}
