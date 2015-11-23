package com.fafica.funcionario;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IRepositorioFuncionario {
	
	public void cadastrar(Funcionario funcionario) throws FuncionarioJaCadastradoException, SQLException, IOException, FuncionarioNaoEncontradoException;
	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException, SQLException, IOException ;
	public void remover(String cpfFuncionario) throws FuncionarioNaoEncontradoException, SQLException, IOException;
	public Funcionario procurar(String cpfFuncionario) throws FuncionarioNaoEncontradoException, SQLException, IOException;
	public boolean existe(String cpfFuncionario) throws FuncionarioNaoEncontradoException, IOException;
	public ArrayList<Funcionario>listar() throws SQLException, IOException;
	
	
	
	

}
