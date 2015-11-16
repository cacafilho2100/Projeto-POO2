package com.fafica.motorista;

import java.util.ArrayList;

public class RepositorioMotoristaArrayList implements IRepositorioMotorista {
	
	
	private ArrayList<Motorista> arrayListMotorista;
	private int id;
	
	public RepositorioMotoristaArrayList(){
		arrayListMotorista = new ArrayList<Motorista>();
		id = 0;
		
	}
	 

	public void cadastrar(Motorista motorista) throws MotoristaJaCadastradoException {
		if(!existe(motorista.getIdMotorista())){
		//motorista.setIdMotorista(id);
		arrayListMotorista.add(motorista);
	    id++;
		 }else{
			throw new MotoristaJaCadastradoException(); 
		}
		
	}

	
	public void atualizar(Motorista motorista) throws MotoristaNaoEncontradoException {
		
		if(!existe(motorista.getIdMotorista())){
			throw new MotoristaNaoEncontradoException();
		}
		
		for(Motorista motorista1 : arrayListMotorista){
			if((motorista1.getIdMotorista() == motorista1.getIdMotorista())){
				arrayListMotorista.remove(motorista1);
				arrayListMotorista.add(motorista);
			}
		}
	}

	
	  public boolean remover(int idMotorista) throws MotoristaNaoEncontradoException{
	    for(Motorista motorista : arrayListMotorista){
		   if(motorista.getIdMotorista() == idMotorista){
		      arrayListMotorista.remove(motorista);
			   System.out.println("Motorista Removido Com Sucesso");
			   return true;

		   }   
	    }
		 
		throw new MotoristaNaoEncontradoException();	 
	}
	

	
	public Motorista procurar(int idMotorista)throws MotoristaNaoEncontradoException {
		for(Motorista motorista : arrayListMotorista){
			if(motorista.getIdMotorista() == idMotorista){
				return motorista;
			}	
		}
		throw new MotoristaNaoEncontradoException("Motorista não Encontrado");
		
	}


	public boolean existe(int idMotorista){
		for (Motorista motorista : arrayListMotorista) {
			if(idMotorista == motorista.getIdMotorista()){
				
	          	return true;
	         }
			
		}
		return false;
	}	

	@Override
	public ArrayList<Motorista> listar() {
	
		
		return arrayListMotorista;
	}


	
}
