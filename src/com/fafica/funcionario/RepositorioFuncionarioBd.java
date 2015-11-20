package com.fafica.funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fafica.ConexaoBanco.ConexaoBanco;

public class RepositorioFuncionarioBd implements IRepositorioFuncionario {
	
	Connection conec;
	
	public RepositorioFuncionarioBd() throws ClassNotFoundException {
		this.conec = ConexaoBanco.conexaoBanco();
		
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
	public void remover(String cpfFuncionario) throws FuncionarioNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Funcionario procurar(String cpfFuncionario) throws FuncionarioNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(String cpfFuncionario) throws FuncionarioNaoEncontradoException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Funcionario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
