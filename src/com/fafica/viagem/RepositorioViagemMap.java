package com.fafica.viagem;

import java.util.ArrayList;
import java.util.TreeMap;

import com.fafica.motorista.Motorista;

public class RepositorioViagemMap implements IRepositorioViagem {

	private TreeMap<Integer,Viagem> arrayMapViagem;
	private int id;
	
	public RepositorioViagemMap(){
		
		arrayMapViagem = new TreeMap<Integer,Viagem>();
		id = 1;
		
	}
	
	public void cadastrar(Viagem viagem) throws ViagemJaCadastradaException {
		if(existe(viagem.getIdViagem())) throw new ViagemJaCadastradaException() ;
		viagem.setIdViagem(id);
		arrayMapViagem.put(id, viagem);
		id++;
		
	}

	public void atualizar(Viagem viagem) throws ViagemNaoEncontradaException {
		int i = getId(viagem.getIdViagem());
		if(i == -1)throw new ViagemNaoEncontradaException();
		arrayMapViagem.put(i, viagem);
	}

	
	public boolean remover(Integer idViagem) throws ViagemNaoEncontradaException {
		int i = getId(idViagem);
		if(i == -1)throw new ViagemNaoEncontradaException();
		arrayMapViagem.remove(i);
		return true;
	}

	
	public Viagem procurar(Integer idViagem) throws ViagemNaoEncontradaException {
		int i = getId(idViagem);
		if(i ==-1)throw new ViagemNaoEncontradaException();
		return arrayMapViagem.get(i);
	}

	
	public boolean existe(Integer idViagem) {
		for (int i = 1; i < arrayMapViagem.size(); i++) {
			Viagem viagem = arrayMapViagem.get(i);
			if(idViagem.equals(viagem.getIdViagem())){
			return true;	
			}
			}
		return false;
	}

	
	public ArrayList<Viagem> listar() {
		ArrayList<Viagem> arrayListViagem = new ArrayList<Viagem>();
			for (Viagem viagem : arrayListViagem) {
				arrayListViagem.add(viagem);
			}
			return arrayListViagem;
	}
		
	
	private int getId(Integer idViagem) {
		int aux = -1;
		boolean aux1 = false;
		for (int i = 0; !aux1 && (i < id); i = i + 1) {
			if (arrayMapViagem.get(i).equals(idViagem)) {
				aux = i;
				aux1 = true;
			}
		}
		return aux;
	}

}
