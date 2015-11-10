package com.fafica.motorista;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class RepositorioMotoristaSet implements IRepositorioMotorista {
	
	private TreeSet<Motorista> arraySetMotorista;
	private Integer id;
	
	public RepositorioMotoristaSet(){
		
		arraySetMotorista = new TreeSet<Motorista>();
		id = 1;
		
	}
	
	
	public void cadastrar(Motorista motorista) {
		if(existe(motorista.getIdMotorista()));
		motorista.setIdMotorista(id);
		arraySetMotorista.add(motorista);
		id++;	
	}

	
	public void atualizar(Motorista motorista) {
		int i = getId(motorista.getIdMotorista());
		if(i == -1);
		arraySetMotorista.add(motorista);	
	}

	
	public boolean remover(Integer idMotorista) {
		int i = getId(idMotorista);
		if(i == -1) ;
		arraySetMotorista.remove(i);
		return true;
	
	}

	
	public Motorista procurar(Integer idMotorista) {
		int i = getId(idMotorista);
		if(i == -1);
		return ((List<Motorista>) arraySetMotorista).get(i);	
	}


	
	public boolean existe(Integer idMotorista) {
		for (Motorista motorista : arraySetMotorista) {
				if (id.equals(motorista.getIdMotorista())) {
							return true;
						}
					}
			
			 		return false;		
	}

	
	public ArrayList<Motorista> listar() {
				ArrayList<Motorista> arraySetMotorista = new ArrayList<Motorista>();
				for (Motorista motorista : arraySetMotorista) {
					arraySetMotorista.add(motorista);
				}
				return arraySetMotorista;
		
		
	}
	
	private int getId(Integer idMotorista) {
		int aux = -1;
		boolean aux1 = false;
		for (int i = 0; !aux1 && (i < id); i = i + 1) {
			if (((List<Motorista>) arraySetMotorista).get(i).equals(idMotorista)) {
				aux = i;
				aux1 = true;
			}
		}
		return aux;
	}

}
