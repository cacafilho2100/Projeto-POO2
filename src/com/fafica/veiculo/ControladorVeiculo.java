package com.fafica.veiculo;

import java.util.ArrayList;

import com.fafica.util.CampoObrigatorioInvalidoException;

public class ControladorVeiculo {
	
	private IRepositorioVeiculo repositorioVeiculo;
	
	public ControladorVeiculo(){
		this.repositorioVeiculo = new RepositorioVeiculoArrayList();
		this.repositorioVeiculo = new RepositorioVeiculoMap();
		this.repositorioVeiculo = new RepositorioVeiculoSet();
	}
	
	public void cadastrar(Veiculo veiculo) throws VeiculoJaCadastradoException, IllegalArgumentException, CampoObrigatorioInvalidoException{
		if(veiculo == null){
			throw new IllegalArgumentException();
		}
		if(veiculo.getidVeiculo().equals(" ")){
			throw new CampoObrigatorioInvalidoException("Nome");
		}
		repositorioVeiculo.cadastrar(veiculo);
	}
	
	public void atualizar(Veiculo veiculo) throws VeiculoNaoEncontradoException, CampoObrigatorioInvalidoException{
		if(veiculo.getidVeiculo().equals(" ")){
			throw new CampoObrigatorioInvalidoException();
		}
		repositorioVeiculo.atualizar(veiculo);
	}
	
	public Boolean existe(Integer idVeiculo){
		return repositorioVeiculo.existe(idVeiculo);
	}
	
	public void remover(Integer idVeiculo) throws VeiculoNaoEncontradoException{
		if(idVeiculo == idVeiculo){
			repositorioVeiculo.remover(idVeiculo);
		}
	}
	
	public Veiculo procurar(Integer idVeiculo) throws VeiculoNaoEncontradoException{
		return repositorioVeiculo.procurar(idVeiculo);
	}
	
	public ArrayList<Veiculo> listar(){
		return repositorioVeiculo.listar();
	}

}
