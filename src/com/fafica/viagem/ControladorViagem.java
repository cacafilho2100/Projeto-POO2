package com.fafica.viagem;

import java.util.ArrayList;


import com.fafica.util.CampoObrigatorioInvalidoException;

public class ControladorViagem {
	
	private IRepositorioViagem repositorioViagem;
	
	
	public ControladorViagem(){
		
		this.repositorioViagem = new RepositorioViagemArrayList();
		
	}
	
   public void cadastrar(Viagem viagem)throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException {
		

		//Validar as Informa��es de viagem
		if(viagem == null) throw new CampoObrigatorioInvalidoException("Viagem n�o encontrada");
		if(viagem.getDestino().equals(""))throw new CampoObrigatorioInvalidoException("Destino");
		
		//Cadastrando viagem
		repositorioViagem.cadastrar(viagem);
		
	}
	
	public void atualizar(Viagem viagem)throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException {
		
		//Validar As Informa��es de viagem
		if (viagem.getDestino().equals("")) throw new CampoObrigatorioInvalidoException("Nome � nulo ou Inv�lido.");
		
		//Atualiza��o da Viagem
		repositorioViagem.atualizar(viagem);
			
	}
	
	public boolean remover(Integer idViagem)throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException {
		Viagem viagem = null;
		
		
		viagem = procurar(idViagem);
		
		//Removendo viagem
	  return repositorioViagem.remover(idViagem);
		
		
	}
	
	public Viagem procurar(Integer idViagem)throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException{
		Viagem viagem = null;
		
		viagem = this.repositorioViagem.procurar(idViagem);
		return viagem;
	}
	
	public boolean existe(Integer idViagem){
		
		return repositorioViagem.existe(idViagem);
	}
	
	
	public ArrayList<Viagem> listar(){
		
		ArrayList<Viagem> viagem = null;
		
		viagem =  this.repositorioViagem.listar();
        return viagem;
		
	}
	
	
	

}
