package com.fafica.veiculo;

import java.sql.SQLException;
import java.util.ArrayList;

import com.fafica.util.CampoObrigatorioInvalidoException;

public class ControladorVeiculo {
	
	private IRepositorioVeiculo repositorioVeiculo;
	
	public ControladorVeiculo() throws ClassNotFoundException, SQLException{
		//this.repositorioVeiculo = new RepositorioVeiculoArrayList();
		//this.repositorioVeiculo = new RepositorioVeiculoMap();
		//this.repositorioVeiculo = new RepositorioVeiculoSet();
		this.repositorioVeiculo = new RepositorioVeiculoBd();
	}
	
	public void cadastrar(Veiculo veiculo) throws VeiculoJaCadastradoException, IllegalArgumentException, CampoObrigatorioInvalidoException, SQLException{
		if(veiculo == null){
			throw new IllegalArgumentException();
		}
		if(veiculo.getidVeiculo().equals(" ")){
			throw new CampoObrigatorioInvalidoException("Nome");
		}
		repositorioVeiculo.cadastrar(veiculo);
	}
	
	public void atualizar(Veiculo veiculo) throws VeiculoNaoEncontradoException, CampoObrigatorioInvalidoException, SQLException{
		if(veiculo.getidVeiculo().equals(" ")){
			throw new CampoObrigatorioInvalidoException();
		}
		repositorioVeiculo.atualizar(veiculo);
	}
	
	public Boolean existe(Integer idVeiculo){
		return repositorioVeiculo.existe(idVeiculo);
	}
	
	public void remover(Integer idVeiculo) throws VeiculoNaoEncontradoException, SQLException{
		if(idVeiculo == idVeiculo){
			repositorioVeiculo.remover(idVeiculo);
		}
	}
	
	public Veiculo procurar(Integer idVeiculo) throws VeiculoNaoEncontradoException, SQLException{
		return repositorioVeiculo.procurar(idVeiculo);
	}
	
	public ArrayList<Veiculo> listar() throws SQLException{
		return repositorioVeiculo.listar();
	}

}
