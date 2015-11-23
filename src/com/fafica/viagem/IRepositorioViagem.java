package com.fafica.viagem;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IRepositorioViagem {
	
	public void cadastrar(Viagem viagem) throws ViagemJaCadastradaException, SQLException;
	public void atualizar(Viagem viagem) throws ViagemNaoEncontradaException, SQLException;
	public boolean remover(int idViagem)throws ViagemNaoEncontradaException, SQLException;
	public Viagem procurar(int idViagem) throws ViagemNaoEncontradaException, SQLException;
	public boolean existe(int idViagem);
	public ArrayList<Viagem> listar() throws SQLException;


}
