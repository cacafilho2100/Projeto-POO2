package com.fafica.motorista;
import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;


public class RepositorioMotoristaSet implements IRepositorioMotorista {
	
	private TreeSet<Integer,Motorista> motoristaSet;
	private Integer id;
	
	public RepositorioMotoristaSet(){
		
		motoristaSet = new TreeSet<Integer,Motorista>();
		id = 0;
		
	}
	
	
	public void cadastrar(Motorista motorista) throws MotoristaJaCadastradoException {
		if(existe(motorista.getIdMotorista())) throw new MotoristaJaCadastradoException();
		//motorista.setIdMotorista(id);
		arraySetMotorista.add(motorista);
		//id++;	
	}

	
	public void atualizar(Motorista motorista)throws MotoristaNaoEncontradoException {
		int i = getId(motorista.getIdMotorista());
		if(i == -1)throw new MotoristaNaoEncontradoException();
		arraySetMotorista.add(motorista);	
	}
	
	public boolean remover(int idMotorista) throws MotoristaNaoEncontradoException  {
				
				
				for (Motorista motorista : arraySetMotorista) {
					if (idMotorista == (motorista.getIdMotorista())) {
		
						arraySetMotorista.remove(motorista);
		
				} else {
					throw new MotoristaNaoEncontradoException();
					}
				}
				return true;
		
      	 	}
	
	public Motorista procurar(int idMotorista) throws MotoristaNaoEncontradoException{
		
		for (Motorista motorista : arraySetMotorista) {
			if (idMotorista == (motorista.getIdMotorista())) {

				return motorista;

		} else {
			throw new MotoristaNaoEncontradoException();
			}
		}
		return null;
		

	}


	
	public boolean existe(int idMotorista) {
		for (Motorista motorista : arraySetMotorista) {
				if (idMotorista == (motorista.getIdMotorista())) {
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
	
	private int getId(int idMotorista) {
		int aux = -1;
		boolean aux1 = false;
		for (int i = 0; !aux1 && (i < id); i = i + 1) {
			if (( arraySetMotorista).get(i).equals(idMotorista)) {
				aux = i;
				aux1 = true;
			}
		}
		return aux;
	}

}
