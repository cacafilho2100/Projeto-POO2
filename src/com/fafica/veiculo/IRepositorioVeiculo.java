package com.fafica.veiculo;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IRepositorioVeiculo {
	
	public void cadastrar(Veiculo veiculo) throws VeiculoJaCadastradoException, SQLException;
	public void atualizar(Veiculo veiculo) throws VeiculoNaoEncontradoException, SQLException;
	public void remover(Integer idVeiculo) throws VeiculoNaoEncontradoException, SQLException;
	public Veiculo procurar(Integer idVeiculo) throws VeiculoNaoEncontradoException, SQLException;
	public boolean existe(Integer idVeiculo);
	public ArrayList<Veiculo> listar() throws SQLException;


}
