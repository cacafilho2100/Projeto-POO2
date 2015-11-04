package com.fafica.motorista;

import java.util.ArrayList;


public interface IRepositorioMotorista {
	
	public void cadastrar(Motorista motorista);
	public void atualizar(Motorista motorista);
	public boolean remover(Integer idMotorista);
	public Motorista procurar(Integer idMotorista);
	public boolean existe(Integer idMotorista);
	public ArrayList<Motorista> listar();


}
