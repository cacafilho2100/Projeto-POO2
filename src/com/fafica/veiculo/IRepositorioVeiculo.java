package com.fafica.veiculo;

import java.util.ArrayList;

public interface IRepositorioVeiculo {
	
	public void cadastrar(Veiculo veiculo) throws VeiculoJaCadastradoException;
	public void atualizar(Veiculo veiculo) throws VeiculoNaoEncontradoException;
	public void remover(Integer idVeiculo) throws VeiculoNaoEncontradoException;
	public Veiculo procurar(Integer idVeiculo) throws VeiculoNaoEncontradoException;
	public boolean existe(Integer idVeiculo);
	public ArrayList<Veiculo> listar();


}
