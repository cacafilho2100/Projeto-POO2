package com.fafica.viagem;

import java.util.ArrayList;

public interface IRepositorioViagem {
	
	public void cadastrar(Viagem viagem) throws ViagemJaCadastradaException;
	public void atualizar(Viagem viagem) throws ViagemNaoEncontradaException;
	public boolean remover(Integer idViagem)throws ViagemNaoEncontradaException;
	public Viagem procurar(Integer idViagem) throws ViagemNaoEncontradaException;
	public boolean existe(Integer idViagem);
	public ArrayList<Viagem> listar();


}
