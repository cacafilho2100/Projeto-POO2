package com.fafica.viagem;

import java.util.ArrayList;
import java.util.TreeSet;


public class RepositorioViagemSet implements IRepositorioViagem {
	
	private TreeSet<Viagem> arraySetViagem;
	private int id;
	
	
	public RepositorioViagemSet(){
		
		 arraySetViagem = new TreeSet<Viagem>();
		 id = 1;
		
	}
		
	public void cadastrar(Viagem viagem) throws ViagemJaCadastradaException {
		if(existe(viagem.getIdViagem()))throw new ViagemJaCadastradaException();
		viagem.setIdViagem(id);
		arraySetViagem.add(viagem);
		id++;
	}

	
	public void atualizar(Viagem viagem) throws ViagemNaoEncontradaException {
		int i = getId(viagem.getIdViagem());
		if(i == -1)throw new ViagemNaoEncontradaException();
		arraySetViagem.add(viagem);
		
	}
	
	public boolean remover(int idViagem) throws ViagemNaoEncontradaException  {
		
		
		for (Viagem viagem : arraySetViagem) {
			if (idViagem == viagem.getIdViagem()) {

				arraySetViagem.remove(viagem);

		} else {
			throw new ViagemNaoEncontradaException();
			}
		}
		return true;

	 	}
	

	//public boolean remover(Integer idViagem) throws ViagemNaoEncontradaException {
		//int i = getId(idViagem);
		//if(i == -1);
		//arraySetViagem.remove(i);
		//return true;
	//}

	
	public Viagem procurar(int idViagem) throws ViagemNaoEncontradaException {

		for (Viagem viagem : arraySetViagem) {
			if (idViagem == viagem.getIdViagem()) {

				return viagem;

		} else {
			throw new ViagemNaoEncontradaException();
			}
		}
		return null;
			
	}

	
	public boolean existe(int idViagem) {
		for (Viagem viagem : arraySetViagem) {
			if (idViagem == viagem.getIdViagem()) {
						return true;
					}
				}
		
		 		return false;		
	}
	
	
	

	@Override
	public ArrayList<Viagem> listar() {
		ArrayList<Viagem> arrayListViagem = new ArrayList<Viagem>();
		for (Viagem viagem : arrayListViagem) {
			arrayListViagem.add(viagem);
		}
		return arrayListViagem;
  }
	
	
	private int getId(int idViagem) {
		int aux = -1;
		boolean aux1 = false;
		for (int i = 0; !aux1 && (i < id); i = i + 1) {
			if (((List<Viagem>) arraySetViagem).get(i).equals(idViagem)) {
				aux = i;
				aux1 = true;
			}
		}
		return aux;
	}

}
