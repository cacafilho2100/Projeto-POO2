package com.fafica.veiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fafica.ConexaoBanco.ConexaoBanco;

public class RepositorioVeiculoBd implements IRepositorioVeiculo {

Connection conec ;
	
	public RepositorioVeiculoBd() throws ClassNotFoundException{
		this.conec = ConexaoBanco.conexaoBanco();
	}

	@Override
	public void cadastrar(Veiculo veiculo) throws VeiculoJaCadastradoException, SQLException {
		String sql = "insert into Veiculo(idveiculo,quantpassageiro,modelo,placa,chassi,cor,ano)values(?,?,?,?,?,?,?)";
		PreparedStatement prepareStatement = conec.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		
		prepareStatement.setInt(1, veiculo.getidVeiculo());
		prepareStatement.setInt(2, veiculo.getQuantPassageiro());
		prepareStatement.setString(3, veiculo.getModelo());
		prepareStatement.setString(4, veiculo.getPlaca());
		prepareStatement.setString(5, veiculo.getChassi());
		prepareStatement.setString(6, veiculo.getCor());
		prepareStatement.setInt(7, veiculo.getAno());
		
		prepareStatement.execute();
	}

	@Override
	public void atualizar(Veiculo veiculo) throws VeiculoNaoEncontradoException, SQLException {
		String sql = "update Veiculo set idveiculo =?,quantpassageiro =?,modelo =?,placa =?,chassi =?,cor =?,ano =?";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		prepareStatement.setInt(1, veiculo.getidVeiculo());
		prepareStatement.setInt(2, veiculo.getQuantPassageiro());
		prepareStatement.setString(3, veiculo.getModelo());
		prepareStatement.setString(4, veiculo.getPlaca());
		prepareStatement.setString(5, veiculo.getChassi());
		prepareStatement.setString(6, veiculo.getCor());
		prepareStatement.setInt(7, veiculo.getAno());
		
		prepareStatement.setInt(8, veiculo.getidVeiculo());
		
		prepareStatement.executeUpdate();
	}

	@Override
	public void remover(Integer idVeiculo) throws VeiculoNaoEncontradoException, SQLException {
		String sql = "delete from Veiculo where idveiculo = ?";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		prepareStatement.setInt(1, idVeiculo);
		
		prepareStatement.executeUpdate();
		
	}

	@Override
	public Veiculo procurar(Integer idVeiculo) throws VeiculoNaoEncontradoException, SQLException {
		String sql = "select*from Veiculo where idveiculo =?";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		prepareStatement.setInt(1, idVeiculo);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		
		while(resultSet.next()){
			Integer id = resultSet.getInt(1);
			Integer quant = resultSet.getInt(2);
			String modelo = resultSet.getString(3);
			String placa = resultSet.getString(4);
			String chassi = resultSet.getString(5);
			String cor = resultSet.getString(6);
			Integer ano = resultSet.getInt(7);
			
			Veiculo veiculo = new Veiculo(id,quant,modelo,placa,chassi,cor,ano);
			return veiculo;
		}
		
		return null;
	}

	@Override
	public boolean existe(Integer idVeiculo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Veiculo> listar() throws SQLException {
		ArrayList<Veiculo> list = new ArrayList<Veiculo>();
		String sql = "select*from Veiculo";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		
		while(resultSet.next()){
			Integer id = resultSet.getInt(1);
			Integer quant = resultSet.getInt(2);
			String modelo = resultSet.getString(3);
			String placa = resultSet.getString(4);
			String chassi = resultSet.getString(5);
			String cor = resultSet.getString(6);
			Integer ano = resultSet.getInt(7);
			
			Veiculo veiculo = new Veiculo(id,quant,modelo,placa,chassi,cor,ano);
			list.add(veiculo);
		}
		return list;
	}

}
