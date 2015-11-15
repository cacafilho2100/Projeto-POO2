package com.fafica.veiculo;

import java.util.ArrayList;

public class RepositorioVeiculoArrayList implements IRepositorioVeiculo {
	
	ArrayList<Veiculo> veiculoArrayList;
	
	public RepositorioVeiculoArrayList(){
		veiculoArrayList = new ArrayList<Veiculo>();
	}

	@Override
	public void cadastrar(Veiculo veiculo)throws VeiculoJaCadastradoException {
		if(!existe(veiculo.getidVeiculo())){
			veiculoArrayList.add(veiculo);
		}else{ throw new VeiculoJaCadastradoException(); }
		
	}

	@Override
	public void atualizar(Veiculo veiculo)throws VeiculoNaoEncontradoException {
		for(Veiculo veiculo2 : veiculoArrayList){
			if(veiculo2.getidVeiculo() == veiculo.getidVeiculo()){
				veiculoArrayList.remove(veiculo2);
				veiculoArrayList.add(veiculo);
			}
		}
		if(!existe(veiculo.getidVeiculo())){
			throw new VeiculoNaoEncontradoException();
		}
		
	}

	@Override
	public void remover(Integer idVeiculo) throws VeiculoNaoEncontradoException {
		for(Veiculo veiculo : veiculoArrayList){
			if(veiculo.getidVeiculo().equals(idVeiculo)){
				veiculoArrayList.remove(veiculo);
			}else{ throw new VeiculoNaoEncontradoException(); }
		}
		
	}

	@Override
	public Veiculo procurar(Integer idVeiculo) throws VeiculoNaoEncontradoException {
		for(Veiculo veiculo : veiculoArrayList){
			if(idVeiculo == veiculo.getidVeiculo()){
				return veiculo;
			}
		}
		
		throw new VeiculoNaoEncontradoException();
	}

	@Override
	public boolean existe(Integer idVeiculo) {
		for(Veiculo veiculo : veiculoArrayList){
			if(idVeiculo == veiculo.getidVeiculo()){
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Veiculo> listar() {
		// TODO Auto-generated method stub
		return veiculoArrayList;
	}

}
