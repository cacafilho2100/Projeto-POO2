package com.fafica.viagem;

import java.sql.SQLException;
import java.util.ArrayList;

import com.fafica.util.CampoObrigatorioInvalidoException;

public class ControladorViagem {
	
	private IRepositorioViagem repositorioViagem;
	
	
	public ControladorViagem(){
		
		this.repositorioViagem = new RepositorioViagemIO();
		
	}
	
   public void cadastrar(Viagem viagem)throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException, SQLException {
		

		//Validar as Informa��es de viagem
		if(viagem == null) {
			throw new CampoObrigatorioInvalidoException("Viagem n�o encontrada");
		}
		
		if(viagem.getDestino().equals("")){
			throw new CampoObrigatorioInvalidoException("Destino");
		}
		
		//Cadastrando viagem
		repositorioViagem.cadastrar(viagem);
		
	}
	
	public void atualizar(Viagem viagem)throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException, SQLException {
		
		
		//Atualiza��o da Viagem
		repositorioViagem.atualizar(viagem);
			
	}
	
	public boolean remover(Integer idViagem)throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException, SQLException {
		//Viagem viagem = null;

		
		if(idViagem == idViagem){
			return repositorioViagem.remover(idViagem);
			}
		
	  return false;
		
		
	}
	
	public Viagem procurar(Integer idViagem)throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException, SQLException{
		//Viagem viagem = null;
		
		 return repositorioViagem.procurar(idViagem);
		
	}
	
	public boolean existe(Integer idViagem){
		
		return repositorioViagem.existe(idViagem);
	}
	
	
	public ArrayList<Viagem> listar() throws SQLException{
	
        return repositorioViagem.listar();
		
	}
	
	
	

}
