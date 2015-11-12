package com.fafica.motorista;

import java.util.ArrayList;

public class RepositorioMotoristaList implements IRepositorioMotorista {
	
	
	private ArrayList<Motorista> arrayListMotorista;
	private int id;
	
	public RepositorioMotoristaList(){
		arrayListMotorista = new ArrayList<Motorista>();
		id = 1;
		
	}
	 

	public void cadastrar(Motorista motorista) throws MotoristaJaCadastradoException {
		if(existe(motorista.getIdMotorista())) throw new MotoristaJaCadastradoException();
		//motorista.setIdMotorista(id);
		arrayListMotorista.add(motorista);
		id++;
			
	}

	
	public void atualizar(Motorista motorista) throws MotoristaNaoEncontradoException {
		int i = getId(motorista.getIdMotorista());
		if(i == -1) throw new MotoristaNaoEncontradoException();
		arrayListMotorista.add(i,motorista);
		
	}

	
	public boolean remover(Integer idMotorista) throws MotoristaNaoEncontradoException{
		int i = getId(idMotorista);
		if(i == -1)throw new MotoristaNaoEncontradoException();
		arrayListMotorista.remove(i);
	
		return true;
	}
	

	
	public Motorista procurar(Integer idMotorista)throws MotoristaNaoEncontradoException {
		
		int i = getId(idMotorista);
		if(i == -1)throw new MotoristaNaoEncontradoException();
		return arrayListMotorista.get(i);	
	}


	public boolean existe(Integer idMotorista){
		boolean existe = false;
		for (Motorista motorista : arrayListMotorista) {
			if(idMotorista.equals(motorista.getIdMotorista())){
				existe = true;
				return existe;
			}
		}
		return existe;
	
	}

	@Override
	public ArrayList<Motorista> listar() {
		
		return arrayListMotorista;
	}
	
	
	private int getId(Integer idMotorista) {
		int aux = -1;
		boolean aux1 = false;
		for (int i = 0; !aux1 && (i < id); i = i + 1) {
			if (arrayListMotorista.get(i).equals(idMotorista)) {
				aux = i;
				aux1 = true;
			}
		}
		return aux;
	}

}
