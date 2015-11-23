package com.fafica.motorista;

import java.sql.SQLException;
import java.util.ArrayList;


public interface IRepositorioMotorista {
	
	public void cadastrar(Motorista motorista) throws MotoristaJaCadastradoException, SQLException ;
	public void atualizar(Motorista motorista) throws MotoristaNaoEncontradoException, SQLException;
	public boolean remover(int idMotorista) throws MotoristaNaoEncontradoException, SQLException;
	public Motorista procurar(int idMotorista) throws MotoristaNaoEncontradoException, SQLException;
	public boolean existe(int idMotorista);
	public ArrayList<Motorista> listar() throws SQLException;


}
