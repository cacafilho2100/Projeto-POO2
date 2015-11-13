package com.fafica.motorista;
import java.util.TreeSet;
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
	
	public boolean remover(Integer idMotorista) throws MotoristaNaoEncontradoException  {
				
				
				for (Motorista motorista : arraySetMotorista) {
					if (idMotorista.equals(motorista.getIdMotorista())) {
		
						arraySetMotorista.remove(motorista);
		
				} else {
					throw new MotoristaNaoEncontradoException();
					}
				}
				return true;
		
      	 	}

	
	//public boolean remover(Integer idMotorista)throws MotoristaNaoEncontradoException  {
		//int i = getId(idMotorista);
		//if(i == -1)throw new MotoristaNaoEncontradoException() ;
		//arraySetMotorista.remove(i);
		//return true;
	
	//}

	
	public Motorista procurar(Integer idMotorista) throws MotoristaNaoEncontradoException{
		
		for (Motorista motorista : arraySetMotorista) {
			if (idMotorista.equals(motorista.getIdMotorista())) {

				return motorista;

		} else {
			throw new MotoristaNaoEncontradoException();
			}
		}
		return null;
		

	}


	
	public boolean existe(Integer idMotorista) {
		for (Motorista motorista : arraySetMotorista) {
				if (idMotorista.equals(motorista.getIdMotorista())) {
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
			if (((List<Motorista>) arraySetMotorista).get(i).equals(idMotorista)) {
				aux = i;
				aux1 = true;
			}
		}
		return aux;
	}

}
