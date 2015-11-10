package com.fafica.motorista;
import java.util.ArrayList;
import java.util.TreeMap;

public class RepositorioMotoristaMap implements IRepositorioMotorista {
	

	TreeMap<Integer,Motorista> arrayMapMotorista;
	Integer id;
	
	public RepositorioMotoristaMap(){
		
		arrayMapMotorista = new TreeMap<Integer,Motorista>();
		id = 1;
		
	}
	
	public void cadastrar(Motorista motorista){
		if(existe(motorista.getIdMotorista()));
		motorista.setIdMotorista(id);
		arrayMapMotorista.put(id, motorista);
		id++;
		
	}
	
	public void atualizar(Motorista motorista){
		int i = getId(motorista.getIdMotorista());
		if(i == -1);
		arrayMapMotorista.put(i, motorista);
		
	}
	public boolean remover(Integer idMotorista){
		int i = getId(idMotorista);
		if(i == -1) ;
		arrayMapMotorista.remove(i);
		return true;
			
	}

	public Motorista procurar(Integer idMotorista){
		int i = getId(idMotorista);
		if(i== -1);
		return arrayMapMotorista.get(i);
	}

	public boolean existe(Integer idMotorista) {
		for (int i = 1; i < arrayMapMotorista.size(); i++) {
			Motorista motorista = arrayMapMotorista.get(i);
			if(idMotorista.equals(motorista.getIdMotorista())){
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

	
	
	private int getId(Integer idMotorista) {
		int aux = -1;
		boolean aux1 = false;
		for (int i = 0; !aux1 && (i < id); i = i + 1) {
			if (arrayMapMotorista.get(i).equals(idMotorista)) {
				aux = i;
				aux1 = true;
			}
		}
		return aux;
	}

	

	


}
