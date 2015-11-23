package com.fafica.motorista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fafica.ConexaoBanco.ConexaoBanco;



public class RepositorioMotoristaBd implements IRepositorioMotorista {
	
	
      Connection conec;
	
	public RepositorioMotoristaBd() throws ClassNotFoundException, SQLException {
		this.conec = ConexaoBanco.conexaoBanco();
		
	}

	
	public void cadastrar(Motorista motorista) throws MotoristaJaCadastradoException, SQLException {
		String sql = "insert into Motorista (idMotorista,nomeMotorista,cpfMotorista,enderecoMotorista,telefoneMotorista, salarioMotorista) values(?,?,?,?,?,?)";
		PreparedStatement prepareStatement = conec.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		
		prepareStatement.setInt(1, motorista.getIdMotorista());
		prepareStatement.setString(2, motorista.getNomeMotorista());
		prepareStatement.setString(3, motorista.getCpfMotorista());
		prepareStatement.setString(4, motorista.getEnderecoMotorista());
		prepareStatement.setString(5, motorista.getTelefoneMotorista());
		prepareStatement.setString(6, motorista.getSalarioMotorista());
		
		
		prepareStatement.execute();
		/*
		ResultSet resultSet = prepareStatement.getGeneratedKeys();
		Integer idMotorista = 0;
		while(resultSet.next()){
			idMotorista = resultSet.getInt(1);
		}*/
	}


	@Override
	public void atualizar(Motorista motorista)throws MotoristaNaoEncontradoException, SQLException {
		String sql = "update Motorista set idMotorista = ?,nomeMotorista = ?,cpfMotorista = ?,enderecoMotorista = ?,telefoneMotorista = ?, salarioMotorista";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		prepareStatement.setInt(1, motorista.getIdMotorista());
		prepareStatement.setString(2, motorista.getNomeMotorista());
		prepareStatement.setString(3, motorista.getCpfMotorista());
		prepareStatement.setString(4, motorista.getEnderecoMotorista());
		prepareStatement.setString(5, motorista.getTelefoneMotorista());
		prepareStatement.setString(6, motorista.getSalarioMotorista());
		
		prepareStatement.setInt(7, motorista.getIdMotorista());
		
		prepareStatement.executeUpdate();
		
		
	}


	public boolean remover(int idMotorista)throws MotoristaNaoEncontradoException, SQLException {
		String sql = "delete from Motorista where idMotorista = ?";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		prepareStatement.setInt(1, idMotorista);
		
		prepareStatement.executeUpdate();
		
		return true;
	}

	@Override
	public Motorista procurar(int idMotorista) throws MotoristaNaoEncontradoException, SQLException {
		String sql = "select*from Motorista where idMotorista = ?";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		prepareStatement.setInt(1, idMotorista);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		
		while(resultSet.next()){
			
			int  id = resultSet.getInt(2);
			String nome = resultSet.getString(3);
			String cpf = resultSet.getString(4);
			String endereco = resultSet.getString(5);
			String telefone = resultSet.getString(6);
			String salario = resultSet.getString(6);
			
			Motorista motorista = new Motorista(id,nome,cpf,endereco,telefone, salario);
			return motorista;
		}
		return null;
		
	}

	@Override
	public boolean existe(int idMotorista) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Motorista> listar() throws SQLException{
		ArrayList<Motorista> list = new ArrayList<>();
		
		String sql = "select*from Motorista";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		
		while(resultSet.next()){
			int id = resultSet.getInt(1);
			String nome = resultSet.getString(2);
			String cpf = resultSet.getString(3);
			String endereco = resultSet.getString(4);
			String telefone = resultSet.getString(5);
			String salario = resultSet.getString(6);
			
			Motorista motorista = new Motorista(id,nome,cpf,endereco,telefone, salario);
			list.add(motorista);
		}
		return list;
		
		
	}
	
	
   
    
}