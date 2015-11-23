package com.fafica.veiculo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IRepositorioVeiculo {
	
	public void cadastrar(Veiculo veiculo) throws VeiculoJaCadastradoException, SQLException, IOException;
	public void atualizar(Veiculo veiculo) throws VeiculoNaoEncontradoException, SQLException, IOException;
	public void remover(Integer idVeiculo) throws VeiculoNaoEncontradoException, SQLException, IOException;
	public Veiculo procurar(Integer idVeiculo) throws VeiculoNaoEncontradoException, SQLException, IOException;
	public boolean existe(Integer idVeiculo) throws IOException;
	public ArrayList<Veiculo> listar() throws SQLException, IOException;


}
