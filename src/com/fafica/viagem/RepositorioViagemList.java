package com.fafica.viagem;

import java.util.ArrayList;

public class RepositorioViagemList implements IRepositorioViagem {

	private ArrayList<Viagem> arrayListViagem;
	private int id;
	
	public RepositorioViagemList(){
		
		arrayListViagem = new ArrayList<Viagem>();
		id = 1;	
	}
	
	
	public void cadastrar(Viagem viagem)throws ViagemJaCadastradaException {
		if(existe(viagem.getIdViagem())) throw new ViagemJaCadastradaException();
		viagem.setIdViagem(id);
		arrayListViagem.add(viagem);
		id++;
	}


	public void atualizar(Viagem viagem) throws ViagemNaoEncontradaException{
		int i = getId(viagem.getIdViagem());
		if(i == -1) throw new ViagemNaoEncontradaException();
		arrayListViagem.add(i, viagem);
	
		
	}
	
	public boolean remover(Integer idViagem)throws ViagemNaoEncontradaException {
		int i = getId(idViagem);
		if(i == -1) throw new ViagemNaoEncontradaException();
		arrayListViagem.remove(i);
		
		return true;
	}

	
	public Viagem procurar(Integer idViagem)throws ViagemNaoEncontradaException {
		int i = getId(idViagem);
		if(i == -1)throw new ViagemNaoEncontradaException();
		return arrayListViagem.get(i);
	}

	
	public boolean existe(Integer idViagem) {
		boolean existe = false;
	    for(Viagem viagem : arrayListViagem){
	    	if(idViagem.equals(viagem.getIdViagem()));
	    	existe = true;
	    	return existe;
	    }
		return existe;
	}

	
	public ArrayList<Viagem> listar() {
		
		return arrayListViagem ;
	}
	
	private int getId(Integer idViagem) {
		int aux = -1;
		boolean aux1 = false;
		for (int i = 0; !aux1 && (i < id); i = i + 1) {
			if (arrayListViagem.get(i).equals(idViagem)) {
				aux = i;
				aux1 = true;
			}
		}
		return aux;
	}
	
	

}
