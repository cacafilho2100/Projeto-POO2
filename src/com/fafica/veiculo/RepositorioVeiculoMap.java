package com.fafica.veiculo;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class RepositorioVeiculoMap implements IRepositorioVeiculo {
	
	Map<Integer, Veiculo> veiculoMap;
	
	public RepositorioVeiculoMap(){
		veiculoMap = new TreeMap<Integer, Veiculo>();
	}

	@Override
	public void cadastrar(Veiculo veiculo) throws VeiculoJaCadastradoException {
		if(!existe(veiculo.getidVeiculo())){
			int i = veiculo.getidVeiculo();
			veiculoMap.put(i, veiculo);
		}else{ throw new VeiculoJaCadastradoException(); }
		
	}

	@Override
	public void atualizar(Veiculo veiculo) throws VeiculoNaoEncontradoException {
		if(!existe(veiculo.getidVeiculo())){
			throw new VeiculoNaoEncontradoException();
		}else{
		int i = veiculo.getidVeiculo();
		veiculoMap.put(i, veiculo);
		}
	}

	@Override
	public void remover(Integer idVeiculo) throws VeiculoNaoEncontradoException {
		if(!existe(idVeiculo)){
			throw new VeiculoNaoEncontradoException();
		}else { veiculoMap.remove(idVeiculo); }
		
	}

	@Override
	public Veiculo procurar(Integer idVeiculo) throws VeiculoNaoEncontradoException {
		if(!existe(idVeiculo)){
			throw new VeiculoNaoEncontradoException();
		}
		return veiculoMap.get(idVeiculo);
	}

	@Override
	public boolean existe(Integer idVeiculo) {
		if(veiculoMap.containsKey(idVeiculo)){
			return true;
		}
		return false;
	}

	@Override
	public ArrayList<Veiculo> listar() {
		ArrayList<Veiculo> veiculolist = new ArrayList<Veiculo>();
		Set<Integer> keys = veiculoMap.keySet();
		for(Integer key : keys){
			veiculolist.add(veiculoMap.get(key));
		}
		
		
		return veiculolist;
	}

}
