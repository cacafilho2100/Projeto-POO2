package com.fafica.motorista;
import java.util.ArrayList;


import com.fafica.util.CampoObrigatorioInvalidoException;


public class ControladorMotorista {
	
	private IRepositorioMotorista repositorioMotorista;
	
	
	public ControladorMotorista(){
		
		this.repositorioMotorista = new RepositorioMotoristaMap();
	}

	public void cadastrar(Motorista motorista)throws IllegalArgumentException, MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException {
		

		//Validar As Informações de Motorista
		//if(motorista.getIdMotorista() == motorista.getIdMotorista())throw new MotoristaJaCadastradoException();
		if(motorista == null){  
			throw new IllegalArgumentException("Motorista Invalido");
			
		}
		
		if(motorista.getNomeMotorista().equals("")){
			throw new CampoObrigatorioInvalidoException("Nome");
			
		}
		
		
		//Cadastrando Motorista
		repositorioMotorista.cadastrar(motorista);
		
	}
	
	public void atualizar(Motorista motorista)throws  MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException {
		
		//Validar As Informações de Motorista
		//if (motorista.getNomeMotorista().equals("")) throw new CampoObrigatorioInvalidoException("Nome é nulo ou Inválido.");
		
		//Atualização do Motorista
		repositorioMotorista.atualizar(motorista);
			
	}
	
	public boolean remover(int idMotorista)throws  MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException {
		//Motorista motorista = null;
		
		//idMotorista.idMotorista = null;
		//motorista = procurar(idMotorista);
		if(idMotorista == idMotorista){
		return repositorioMotorista.remover(idMotorista);
		
		}
		//Removendo Motorista
	  //return repositorioMotorista.remover(idMotorista);
		return false;
		
	}

	public Motorista procurar(int idMotorista)throws  MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException{
		//Motorista motorista = null;
		
		//motorista = this.repositorioMotorista.procurar(idMotorista);
		return repositorioMotorista.procurar(idMotorista);
	}
	
	public boolean existe(int idMotorista){
		
		return repositorioMotorista.existe(idMotorista);
	}
	
	
	public ArrayList<Motorista> listar(){
		
		//ArrayList<Motorista> motoristas = null;
	    return repositorioMotorista.listar();
   
		
	}
	
	
	
	
}

		
		
