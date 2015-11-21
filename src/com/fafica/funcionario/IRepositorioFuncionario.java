package com.fafica.funcionario;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IRepositorioFuncionario {
	
	public void cadastrar(Funcionario funcionario) throws FuncionarioJaCadastradoException, SQLException;
	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException, SQLException ;
	public void remover(String cpfFuncionario) throws FuncionarioNaoEncontradoException, SQLException;
	public Funcionario procurar(String cpfFuncionario) throws FuncionarioNaoEncontradoException, SQLException;
	public boolean existe(String cpfFuncionario) throws FuncionarioNaoEncontradoException;
	public ArrayList<Funcionario>listar() throws SQLException;
	
	
	
	

}
