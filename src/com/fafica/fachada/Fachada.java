package com.fafica.fachada;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fafica.fornecedor.ControladorFornecedor;
import com.fafica.funcionario.CPFInvalidoException;
import com.fafica.funcionario.ControladorFuncionario;
import com.fafica.funcionario.Funcionario;
import com.fafica.funcionario.FuncionarioJaCadastradoException;
import com.fafica.funcionario.FuncionarioNaoEncontradoException;
import com.fafica.motorista.ControladorMotorista;
import com.fafica.motorista.Motorista;
import com.fafica.motorista.MotoristaJaCadastradoException;
import com.fafica.motorista.MotoristaNaoEncontradoException;
import com.fafica.util.CampoObrigatorioInvalidoException;
import com.fafica.veiculo.ControladorVeiculo;
import com.fafica.veiculo.Veiculo;
import com.fafica.veiculo.VeiculoJaCadastradoException;
import com.fafica.veiculo.VeiculoNaoEncontradoException;
import com.fafica.viagem.ControladorViagem;
import com.fafica.viagem.Viagem;
import com.fafica.viagem.ViagemJaCadastradaException;
import com.fafica.viagem.ViagemNaoEncontradaException;

public class Fachada{
	
	private static Fachada instance;
	private ControladorFornecedor controladorFornecedor;
	private ControladorFuncionario controladorFuncionario;
	private ControladorVeiculo controladorVeiculo;
	private ControladorMotorista controladorMotorista;
	private ControladorViagem controladorViagem;
	
	
	private Fachada() throws ClassNotFoundException, SQLException {
		this.controladorFornecedor = new ControladorFornecedor();
		this.controladorFuncionario = new ControladorFuncionario();
		this.controladorVeiculo = new ControladorVeiculo();
		this.controladorMotorista = new ControladorMotorista();
		this.controladorViagem =  new ControladorViagem();
	}
	
	public static Fachada getInstance() throws ClassNotFoundException, SQLException{
		if(Fachada.instance == null){
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	//motodos de funcionario
	//*******************************************************************************************************************************************************************************************************************************************************
	public void cadastrarFuncionario(Funcionario funcionario) throws IllegalArgumentException, CPFInvalidoException, FuncionarioJaCadastradoException, CampoObrigatorioInvalidoException, SQLException, IOException, FuncionarioNaoEncontradoException{
		controladorFuncionario.cadastrar(funcionario);
	}
	
	public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioNaoEncontradoException, CPFInvalidoException, CampoObrigatorioInvalidoException, SQLException, IOException{
		controladorFuncionario.atualizar(funcionario);
	}
	
	public Boolean existeFuncionario(String cpfFuncionario) throws FuncionarioNaoEncontradoException, IOException{
		return controladorFuncionario.existe(cpfFuncionario);
	}
	
	public void remorverFuncionario(String cpfFuncionario) throws FuncionarioNaoEncontradoException, CPFInvalidoException, CampoObrigatorioInvalidoException, SQLException, IOException{
		controladorFuncionario.remover(cpfFuncionario);
		
	}
	
	public Funcionario procurarFuncionario(String cpfFuncionario) throws FuncionarioNaoEncontradoException, CPFInvalidoException, SQLException, IOException{
		return controladorFuncionario.procurar(cpfFuncionario);
	}
	
	public ArrayList<Funcionario> listarFuncionario() throws SQLException, IOException{
		return controladorFuncionario.listar();
	}
	
	//metodos Veiculos
	//******************************************************************************************************************************
	
	public void cadastrarVeiculo(Veiculo veiculo) throws VeiculoJaCadastradoException, IllegalArgumentException, CampoObrigatorioInvalidoException, SQLException, IOException{
		controladorVeiculo.cadastrar(veiculo);
	}
	
	public void atualizarVeiculo(Veiculo veiculo) throws VeiculoNaoEncontradoException, CampoObrigatorioInvalidoException, SQLException, IOException{
		controladorVeiculo.atualizar(veiculo);
	}
	
	public Boolean existeVeiculo(Integer idVeiculo) throws IOException{
		return controladorVeiculo.existe(idVeiculo);
	}
	
	public void removerVeiculo(Integer idVeiculo) throws VeiculoNaoEncontradoException, SQLException, IOException{
		controladorVeiculo.remover(idVeiculo);
	}
	
	public Veiculo procurarVeiculo(Integer idVeiculo) throws VeiculoNaoEncontradoException, SQLException, IOException{
		return controladorVeiculo.procurar(idVeiculo);
	}
	
	public ArrayList<Veiculo> listarVeiculo() throws SQLException, IOException{
		return controladorVeiculo.listar();
	}
	
 
                                                    //Metodos de Motorista
//...................................................................................................................................	
    

    public void cadastrarMotorista(Motorista motorista) throws MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException,  SQLException{
         
    	 controladorMotorista.cadastrar(motorista);

     }

    public void atualizarMotorista(Motorista motorista) throws MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException, SQLException{
         
    	 controladorMotorista.atualizar(motorista);
     }

    public boolean existeMotorista(int idMotorista){

         return controladorMotorista.existe(idMotorista);
    }

    public boolean removerMotorista(int idMotorista) throws MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException, SQLException{
   
    	return controladorMotorista.remover(idMotorista);
       
     }

    public Motorista procurarMotorista(int idMotorista) throws MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException, SQLException{

         return controladorMotorista.procurar(idMotorista);

     }

    public ArrayList<Motorista> listarMotorista() throws SQLException {
        
    	return controladorMotorista.listar();
    }
    
                                                          //Metodos de Viagem
  //...................................................................................................................................	
    
    public void cadastrarViagem(Viagem viagem) throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException, SQLException {
        
   	 controladorViagem.cadastrar(viagem);

    }

   public void atualizarViagem(Viagem viagem) throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException, SQLException {
   	 
	   controladorViagem.atualizar(viagem);
    }

   public boolean existeViagem(Integer idViagem){

        return  controladorViagem.existe(idViagem);
   }

   public boolean removerViagem(Integer idViagem) throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException, SQLException {

       return  controladorViagem.remover(idViagem);

    }

   public Viagem procurarViagem(Integer idViagem) throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException, SQLException {

        return controladorViagem.procurar(idViagem);

    }

   public ArrayList<Viagem> listarViagem() throws SQLException {
       
   	return controladorViagem.listar();
   }
    
    

}
