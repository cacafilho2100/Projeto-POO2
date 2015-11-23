package com.fafica.motorista;
import java.sql.SQLException;
import java.util.ArrayList;




import com.fafica.util.CampoObrigatorioInvalidoException;


public class ControladorMotorista {
	
	private IRepositorioMotorista repositorioMotorista;
	
	
	public ControladorMotorista(){
		
		this.repositorioMotorista = new RepositorioMotoristaIO();
	}

	public void cadastrar(Motorista motorista)throws IllegalArgumentException, MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException, SQLException{
		

		//Validar As Informações de Motorista
		
		if(motorista == null){  
			throw new IllegalArgumentException("Motorista Invalido");
			
		}
		
		if(motorista.getNomeMotorista().equals("")){
			throw new CampoObrigatorioInvalidoException("Nome");
			
		}
		
		
		//Cadastrando Motorista
		repositorioMotorista.cadastrar(motorista);
		
	}
	
	public void atualizar(Motorista motorista)throws  MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException, SQLException {
		
		
		//Atualização do Motorista
		repositorioMotorista.atualizar(motorista);
			
	}
	
	public boolean remover(int idMotorista)throws  MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException, SQLException {
		
		
		
		if(idMotorista == idMotorista){
		return repositorioMotorista.remover(idMotorista);
		
		}
		//Removendo Motorista
	  
		return false;
		
	}

	public Motorista procurar(int idMotorista)throws  MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException, SQLException{
		//Motorista motorista = null;
		
		
		return repositorioMotorista.procurar(idMotorista);
	}
	
	public boolean existe(int idMotorista){
		
		return repositorioMotorista.existe(idMotorista);
	}
	
	
	public ArrayList<Motorista> listar() throws SQLException{
		
		
	    return repositorioMotorista.listar();
   
		
	}
	
	
	
	
}

		
		
