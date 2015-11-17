package com.fafica.motorista;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class RepositorioMotoristaMap implements IRepositorioMotorista {
	

	 private Map<Integer,Motorista> motoristaMap;
	 
	
	public RepositorioMotoristaMap(){
		
		motoristaMap = new HashMap<>();
		
		
	}
	
	public void cadastrar(Motorista motorista) throws MotoristaJaCadastradoException{
		if(!existe(motorista.getIdMotorista())){
			motoristaMap.put(motorista.getIdMotorista(), motorista);
			System.out.println("Motorista Cadastrado Com Sucesso! =)");
			
		}else{
			throw new MotoristaJaCadastradoException();
		}	
	}
	
	
	public void atualizar(Motorista motorista)throws MotoristaNaoEncontradoException{
		if(existe(motorista.getIdMotorista())){
			motoristaMap.remove(motorista.getIdMotorista());
			motoristaMap.put(motorista.getIdMotorista(), motorista);
		}else{
			throw new MotoristaNaoEncontradoException();
		}		
	}
	
	

	public boolean remover(int idMotorista)throws MotoristaNaoEncontradoException{
		if(!existe(idMotorista)){
			throw new MotoristaNaoEncontradoException();
			
		}else{
			motoristaMap.remove(idMotorista);
			return true;
		}
	}

	public Motorista procurar(int idMotorista)throws MotoristaNaoEncontradoException{
		if(!existe(idMotorista)){
			throw new MotoristaNaoEncontradoException();
		}else{
			return motoristaMap.get(idMotorista);	
		}
    }
	
	
	public boolean existe(int idMotorista){
		if(motoristaMap.containsKey(idMotorista)){
			return true;
		}
       	
		return false;	
	}
	
	public ArrayList<Motorista> listar() {
		
		return null;
	}
}
