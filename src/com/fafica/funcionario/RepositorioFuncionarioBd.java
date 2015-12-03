package com.fafica.funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fafica.ConexaoBanco.ConexaoBanco;
import com.fafica.ConexaoBanco.ConexaoBancoMysql;

public class RepositorioFuncionarioBd implements IRepositorioFuncionario {
	
	Connection conec;
	
	public RepositorioFuncionarioBd() throws ClassNotFoundException, SQLException {
		this.conec = ConexaoBancoMysql.conexaoBanco();
		
	}

	@Override
	public void cadastrar(Funcionario funcionario) throws FuncionarioJaCadastradoException, SQLException {
		String sql = "insert into Funcionario (cpffuncionario,nomefuncionario,enderecofuncionario,emailfuncionario,telefonefuncionario) values(?,?,?,?,?)";
		PreparedStatement prepareStatement = conec.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		
		prepareStatement.setString(1, funcionario.getCpfFuncionario());
		prepareStatement.setString(2, funcionario.getNomeFuncionario());
		prepareStatement.setString(3, funcionario.getEnderecoFuncionario());
		prepareStatement.setString(4, funcionario.getEmailFuncionario());
		prepareStatement.setString(5, funcionario.getTelefoneFuncionario());
		
		prepareStatement.execute();
		
		ResultSet resultSet = prepareStatement.getGeneratedKeys();
		Integer idFuncionario = 0;
		while(resultSet.next()){
			idFuncionario = resultSet.getInt(1);
		}
	}

	@Override
	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException, SQLException {
		String sql = "update Funcionario set cpffuncionario = ?,nomefuncionario = ?,enderecofuncionario = ?,emailfuncionario = ?,telefonefuncionario = ?";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		prepareStatement.setString(1, funcionario.getCpfFuncionario());
		prepareStatement.setString(2, funcionario.getNomeFuncionario());
		prepareStatement.setString(3, funcionario.getEnderecoFuncionario());
		prepareStatement.setString(4, funcionario.getEmailFuncionario());
		prepareStatement.setString(5, funcionario.getTelefoneFuncionario());
		
		prepareStatement.setString(6, funcionario.getCpfFuncionario());
		
		prepareStatement.executeUpdate();
	}

	@Override
	public void remover(String cpfFuncionario) throws FuncionarioNaoEncontradoException, SQLException {
		String sql = "delete from Funcionario where cpfFuncionario = ?";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		prepareStatement.setString(1, cpfFuncionario);
		
		prepareStatement.executeUpdate();
		
	}

	@Override
	public Funcionario procurar(String cpfFuncionario) throws FuncionarioNaoEncontradoException, SQLException {
		String sql = "select*from Funcionario where cpffuncionario = ?";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		prepareStatement.setString(1, cpfFuncionario);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		
		while(resultSet.next()){
			//int codigo = resultSet.getInt(1);
			String cpf = resultSet.getString(2);
			String nome = resultSet.getString(3);
			String endereco = resultSet.getString(4);
			String email = resultSet.getString(5);
			String telefone = resultSet.getString(6);
			
			Funcionario funcionario = new Funcionario(cpf,nome,endereco,email,telefone);
			return funcionario;
		}
		return null;
	}

	@Override
	public boolean existe(String cpfFuncionario) throws FuncionarioNaoEncontradoException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Funcionario> listar() throws SQLException {
		ArrayList<Funcionario> list = new ArrayList<Funcionario>();
		
		String sql = "select*from Funcionario";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		
		while(resultSet.next()){
			//int codigo = resultSet.getInt(1);
			String cpf = resultSet.getString(2);
			String nome = resultSet.getString(3);
			String endereco = resultSet.getString(4);
			String email = resultSet.getString(5);
			String telefone = resultSet.getString(6);
			
			Funcionario funcionario = new Funcionario(cpf,nome,endereco,email,telefone);
			list.add(funcionario);
		}
		return list;
	}

}
