package com.fafica.veiculo;

import java.util.ArrayList;

public interface IRepositorioVeiculo {
	
	public void cadastrar(Veiculo veiculo);
	public void atualizar(Veiculo veiculo);
	public boolean remover(Integer idVeiculo);
	public Veiculo procurar(Integer idVeiculo);
	public boolean existe(Integer idVeiculo);
	public ArrayList<Veiculo> listar();


}
