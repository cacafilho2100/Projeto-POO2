package com.fafica.motorista;

import java.util.ArrayList;


public interface IRepositorioMotorista {
	
	public void cadastrar(Motorista motorista) throws MotoristaJaCadastradoException ;
	public void atualizar(Motorista motorista) throws MotoristaNaoEncontradoException;
	public boolean remover(int idMotorista) throws MotoristaNaoEncontradoException;
	public Motorista procurar(int idMotorista) throws MotoristaNaoEncontradoException;
	public boolean existe(int idMotorista);
	public ArrayList<Motorista> listar();


}
