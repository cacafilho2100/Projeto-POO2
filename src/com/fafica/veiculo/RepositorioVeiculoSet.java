package com.fafica.veiculo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class RepositorioVeiculoSet implements IRepositorioVeiculo {
	
	HashSet<Veiculo> veiculoSet;
	
	public RepositorioVeiculoSet(){
		veiculoSet = new HashSet<Veiculo>();
	}
	

	@Override
	public void cadastrar(Veiculo veiculo) throws VeiculoJaCadastradoException {
		if(!existe(veiculo.getidVeiculo())){
			veiculoSet.add(veiculo);
		}else{ throw new VeiculoJaCadastradoException(); }
		
	}

	@Override
	public void atualizar(Veiculo veiculo) throws VeiculoNaoEncontradoException {
		for(Veiculo veiculo2 : veiculoSet){
			if(veiculo.getidVeiculo() == veiculo2.getidVeiculo()){
				veiculoSet.remove(veiculo2);
				veiculoSet.add(veiculo);
			}
		}
		if(!existe(veiculo.getidVeiculo())){
			throw new VeiculoNaoEncontradoException();
		}
		
	}

	@Override
	public void remover(Integer idVeiculo)throws VeiculoNaoEncontradoException {
		if(existe(idVeiculo)){
			Veiculo veiculoR = null;
			for(Veiculo veiculo1 : veiculoSet){
				if(veiculo1.getidVeiculo().equals(idVeiculo)){
					veiculoR = veiculo1;
				}
			}
			veiculoSet.remove(veiculoR);
		}else { throw new VeiculoNaoEncontradoException(); }
	}

	@Override
	public Veiculo procurar(Integer idVeiculo) throws VeiculoNaoEncontradoException {
		for(Veiculo veiculo : veiculoSet){
			if(idVeiculo == veiculo.getidVeiculo()){
				return veiculo;
			}
		}
		throw new VeiculoNaoEncontradoException();
	}

	@Override
	public boolean existe(Integer idVeiculo) {
		for(Veiculo veiculo : veiculoSet){
			if(idVeiculo == veiculo.getidVeiculo()){
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Veiculo> listar() {
		ArrayList<Veiculo> arrayVeiculo = new ArrayList<Veiculo>();
		for(Veiculo veiculo : veiculoSet){
			arrayVeiculo.add(veiculo);
		}
		return arrayVeiculo;
	}

}
