package com.fafica.viagem;

import java.util.ArrayList;

public interface IRepositorioViagem {
	
	public void cadastrar(Viagem viagem);
	public void atualizar(Viagem viagem);
	public boolean remover(Integer idViagem);
	public Viagem procurar(Integer idViagem);
	public boolean existe(Integer idViagem);
	public ArrayList<Viagem> listar();


}
