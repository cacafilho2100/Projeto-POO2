package com.fafica.viagem;

import java.util.ArrayList;

import com.fafica.util.CampoObrigatorioInvalidoException;

public class ControladorViagem {
	
	private IRepositorioViagem repositorioViagem;
	
	
	public ControladorViagem(){
		
		this.repositorioViagem = new RepositorioViagemMap();
		
	}
	
   public void cadastrar(Viagem viagem)throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException {
		

		//Validar as Informações de viagem
		if(viagem == null) {
			throw new CampoObrigatorioInvalidoException("Viagem não encontrada");
		}
		
		if(viagem.getDestino().equals("")){
			throw new CampoObrigatorioInvalidoException("Destino");
		}
		
		//Cadastrando viagem
		repositorioViagem.cadastrar(viagem);
		
	}
	
	public void atualizar(Viagem viagem)throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException {
		
		//Validar As Informações de viagem
		//if (viagem.getDestino().equals("")) throw new CampoObrigatorioInvalidoException("Nome é nulo ou Inválido.");
		
		//Atualização da Viagem
		repositorioViagem.atualizar(viagem);
			
	}
	
	public boolean remover(Integer idViagem)throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException {
		//Viagem viagem = null;

		
		if(idViagem == idViagem){
			return repositorioViagem.remover(idViagem);
			}
		
	  return false;
		
		
	}
	
	public Viagem procurar(Integer idViagem)throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException{
		//Viagem viagem = null;
		
		 return repositorioViagem.procurar(idViagem);
		
	}
	
	public boolean existe(Integer idViagem){
		
		return repositorioViagem.existe(idViagem);
	}
	
	
	public ArrayList<Viagem> listar(){
	
        return repositorioViagem.listar();
		
	}
	
	
	

}
