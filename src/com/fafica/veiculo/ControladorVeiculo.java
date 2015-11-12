package com.fafica.veiculo;

import java.util.ArrayList;

public class ControladorVeiculo {
	
	private IRepositorioVeiculo repositorioVeiculo;
	
	public ControladorVeiculo(){
		this.repositorioVeiculo = new RepositorioVeiculoArrayList();
	}
	
	public void cadastrar(Veiculo veiculo){
		repositorioVeiculo.cadastrar(veiculo);
	}
	
	public void atualizar(Veiculo veiculo){
		repositorioVeiculo.atualizar(veiculo);
	}
	
	public Boolean existe(Integer idVeiculo){
		return repositorioVeiculo.existe(idVeiculo);
	}
	
	public void remover(Integer idVeiculo){
		repositorioVeiculo.remover(idVeiculo);
	}
	
	public Veiculo procurar(Integer idVeiculo){
		return repositorioVeiculo.procurar(idVeiculo);
	}
	
	public ArrayList<Veiculo> listar(){
		return repositorioVeiculo.listar();
	}

}
