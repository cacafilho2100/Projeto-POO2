package com.fafica.viagem;

import java.util.ArrayList;

public interface IRepositorioViagem {
	
	public void cadastrar(Viagem viagem) throws ViagemJaCadastradaException;
	public void atualizar(Viagem viagem) throws ViagemNaoEncontradaException;
	public boolean remover(int idViagem)throws ViagemNaoEncontradaException;
	public Viagem procurar(int idViagem) throws ViagemNaoEncontradaException;
	public boolean existe(int idViagem);
	public ArrayList<Viagem> listar();


}
