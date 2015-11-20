package com.fafica.motorista;

import java.util.ArrayList;


public class RepositorioMotoristaBd implements IRepositorioMotorista {

	@Override
	public void cadastrar(Motorista motorista)
			throws MotoristaJaCadastradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Motorista motorista)
			throws MotoristaNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean remover(int idMotorista)
			throws MotoristaNaoEncontradoException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Motorista procurar(int idMotorista)
			throws MotoristaNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(int idMotorista) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Motorista> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
   
    
}