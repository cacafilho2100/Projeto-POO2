package com.fafica.motorista;
import java.util.ArrayList;
import Util.CampoObrigatorioInvalidoException;


public class ControladorMotorista {
	
	private IRepositorioMotorista repositorioMotorista;
	
	
	public ControladorMotorista(){
		
		this.repositorioMotorista = new RepositorioMotoristaArrayList();
	}

	public void cadastrar(Motorista morista)throws MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException {
		
		
		
		
	}
}
