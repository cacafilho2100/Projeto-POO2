package com.fafica.motorista;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;


public class RepositorioMotoristaSet implements IRepositorioMotorista {
	
	private Set<Motorista> motoristaSet;
	
	
	public RepositorioMotoristaSet(){
		
		motoristaSet = new HashSet<>();	
	}
	
	public void cadastrar(Motorista motorista) throws MotoristaJaCadastradoException {
		if(!existe(motorista.getIdMotorista())){
			motoristaSet.add(motorista);
			System.out.println("Motorista Cadastrado Com Sucesso!");
	
		 }else{
			throw new MotoristaJaCadastradoException(); 
		}
		
	}

	
	public void atualizar(Motorista motorista) throws MotoristaNaoEncontradoException {
		
		if(!existe(motorista.getIdMotorista())){
			throw new MotoristaNaoEncontradoException();
		}
		
		for(Motorista motorista1 : motoristaSet){
			if((motorista1.getIdMotorista() == motorista1.getIdMotorista())){
				motoristaSet.remove(motorista1);
				motoristaSet.add(motorista);
			}
		}
	}

	
	  public boolean remover(int idMotorista) throws MotoristaNaoEncontradoException{
	    for(Motorista motorista : motoristaSet){
		   if(motorista.getIdMotorista() == idMotorista){
			   motoristaSet.remove(motorista);
			   System.out.println("Motorista Removido Com Sucesso");
			   return true;

		   }   
	    }
		 
		throw new MotoristaNaoEncontradoException();	 
	}
	

	
	public Motorista procurar(int idMotorista)throws MotoristaNaoEncontradoException {
		for(Motorista motorista : motoristaSet){
			if(motorista.getIdMotorista() == idMotorista){
				return motorista;
			}	
		}
		throw new MotoristaNaoEncontradoException("Motorista não Encontrado");
		
	}


	public boolean existe(int idMotorista){
		for (Motorista motorista : motoristaSet) {
			if(idMotorista == motorista.getIdMotorista()){
				
	          	return true;
	         }
			
		}
		return false;
	}	
	
	
	public ArrayList<Motorista> listar() {
		ArrayList<Motorista> lista = new ArrayList<Motorista>();
		for(Motorista motorista: motoristaSet){
			lista.add(motorista);
		}
		return lista;
	}

	

}
