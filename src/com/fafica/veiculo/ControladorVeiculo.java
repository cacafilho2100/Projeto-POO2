package com.fafica.veiculo;

import java.io.IOException;
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
	
	public void cadastrar(Veiculo veiculo) throws VeiculoJaCadastradoException, IllegalArgumentException, CampoObrigatorioInvalidoException, SQLException, IOException{
		if(veiculo == null){
			throw new IllegalArgumentException();
		}
		if(veiculo.getidVeiculo().equals(" ")){
			throw new CampoObrigatorioInvalidoException("Nome");
		}
		repositorioVeiculo.cadastrar(veiculo);
	}
	
	public void atualizar(Veiculo veiculo) throws VeiculoNaoEncontradoException, CampoObrigatorioInvalidoException, SQLException, IOException{
		if(veiculo.getidVeiculo().equals(" ")){
			throw new CampoObrigatorioInvalidoException();
		}
		repositorioVeiculo.atualizar(veiculo);
	}
	
	public Boolean existe(Integer idVeiculo) throws IOException{
		return repositorioVeiculo.existe(idVeiculo);
	}
	
	public void remover(Integer idVeiculo) throws VeiculoNaoEncontradoException, SQLException, IOException{
		if(idVeiculo == idVeiculo){
			repositorioVeiculo.remover(idVeiculo);
		}
	}
	
	public Veiculo procurar(Integer idVeiculo) throws VeiculoNaoEncontradoException, SQLException, IOException{
		return repositorioVeiculo.procurar(idVeiculo);
	}
	
	public ArrayList<Veiculo> listar() throws SQLException, IOException{
		return repositorioVeiculo.listar();
	}

}
