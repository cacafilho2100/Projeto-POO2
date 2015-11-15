package com.fafica.veiculo;

import java.util.ArrayList;
import java.util.Map;
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
		for(int i = 0; i < veiculoMap.size();i++){
			Veiculo veiculo1 = veiculoMap.get(idVeiculo);
			if(idVeiculo == veiculo1.getidVeiculo()){
				veiculoMap.remove(veiculo1.getidVeiculo());
			}else {throw new VeiculoNaoEncontradoException();}
		}
		
	}

	@Override
	public Veiculo procurar(Integer idVeiculo) throws VeiculoNaoEncontradoException {
		for(int i = 0;i < veiculoMap.size();i++){
			Veiculo veiculo1 = veiculoMap.get(idVeiculo);
			if(idVeiculo == veiculo1.getidVeiculo()){
				return veiculoMap.get(idVeiculo);
			}
		}
		throw new VeiculoNaoEncontradoException();
	}

	@Override
	public boolean existe(Integer idVeiculo) {
		for(int i = 0; i < veiculoMap.size();i++){
			Veiculo veiculo1 = veiculoMap.get(idVeiculo);
			if(idVeiculo == veiculo1.getidVeiculo()){
				
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Veiculo> listar() {
		ArrayList<Veiculo> veiculolist = new ArrayList<Veiculo>();
		for(Veiculo veiculo : veiculolist){
			veiculolist.add(veiculo);
		}
		
		return veiculolist;
	}

}
