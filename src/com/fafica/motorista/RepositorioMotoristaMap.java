package com.fafica.motorista;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class RepositorioMotoristaMap implements IRepositorioMotorista {
	

	 private TreeMap<Integer,Motorista> motoristaMap;
	 private Integer id;
	
	public RepositorioMotoristaMap(){
		
		motoristaMap = new TreeMap<Integer,Motorista>();
		id = 0;
		
	}
	
	public void cadastrar(Motorista motorista) throws MotoristaJaCadastradoException{
		if(!existe(motorista.getIdMotorista())){
			motoristaMap.put(id, motorista);
		
		}else{
			throw new MotoristaJaCadastradoException();
		}				
	}
	
	
	public void atualizar(Motorista motorista)throws MotoristaNaoEncontradoException{
		if(!existe(motorista.getIdMotorista())){
			throw new MotoristaNaoEncontradoException();
		}
		int i = motorista.getIdMotorista();
		motoristaMap.put(i, motorista);
		
	}
	
	

	public boolean remover(int idMotorista)throws MotoristaNaoEncontradoException{
		for(int i = 0; i < id;i++){
			Motorista motorista = motoristaMap.get(i);
			if(idMotorista == motorista.getIdMotorista()){
				motoristaMap.remove(i);
				System.out.println("Motorista Removido Com Sucesso");
				
				return true;
			} 
		}
		throw new MotoristaNaoEncontradoException(); 
			
	}

	public Motorista procurar(int idMotorista)throws MotoristaNaoEncontradoException{
		for(int i = 0; i < motoristaMap.size();i++){
			Motorista motorista = motoristaMap.get(i);
			if(idMotorista == motorista.getIdMotorista()){
				return motorista;
		    }
	   }
		throw new MotoristaNaoEncontradoException(); 
		
    }
	
	
	public boolean existe(int idMotorista){
		
		for (int i = 0; i < motoristaMap.size(); i++) {
			Motorista motorista = motoristaMap.get(i);
			if(idMotorista == motorista.getIdMotorista()){
			
			return true;	
			 }
			}
		return false;
	}
	
	public ArrayList<Motorista> listar() {
		ArrayList<Motorista> arrayListMotorista = new ArrayList<Motorista>();
		for (Motorista motorista : arrayListMotorista) {
			arrayListMotorista.add(motorista);
		}
		return arrayListMotorista;
	}

}
