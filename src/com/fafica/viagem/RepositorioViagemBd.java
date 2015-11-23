
package com.fafica.viagem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fafica.ConexaoBanco.ConexaoBanco;
import com.fafica.motorista.Motorista;


public class RepositorioViagemBd implements IRepositorioViagem{
	
	
	 Connection conec;
		
		public RepositorioViagemBd() throws ClassNotFoundException, SQLException {
			this.conec = ConexaoBanco.conexaoBanco();
			
		}

	
	public void cadastrar(Viagem viagem) throws ViagemJaCadastradaException, SQLException {
		
		String sql = "insert into Viagem (idViagem,destino,custo,data) values(?,?,?,?)";
		PreparedStatement prepareStatement = conec.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		
		prepareStatement.setInt(1, viagem.getIdViagem());
		prepareStatement.setString(2, viagem.getDestino());
		prepareStatement.setString(3, viagem.getCusto());
		prepareStatement.setString(4, viagem.getData());
	
		prepareStatement.execute();
		
		
	}

	@Override
	public void atualizar(Viagem viagem) throws ViagemNaoEncontradaException, SQLException {
		String sql = "update Viagem set idViagem = ?,destino = ?,cpfMotorista = ?,custo = ?,data = ?";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		prepareStatement.setInt(1, viagem.getIdViagem());
		prepareStatement.setString(2, viagem.getDestino());
		prepareStatement.setString(3, viagem.getCusto());
		prepareStatement.setString(4, viagem.getData());
		
		
		prepareStatement.setInt(5, viagem.getIdViagem());
		
		prepareStatement.executeUpdate();
		
	}

	
	public boolean remover(int idViagem) throws ViagemNaoEncontradaException, SQLException {
		String sql = "delete from Viagem where idViagem = ?";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		prepareStatement.setInt(1, idViagem);
		
		prepareStatement.executeUpdate();
		
		return true;
	}

	@Override
	public Viagem procurar(int idViagem) throws ViagemNaoEncontradaException, SQLException {
		String sql = "select*from Viagem where idViagem = ?";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		prepareStatement.setInt(1, idViagem);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		
		while(resultSet.next()){
			
			int  id = resultSet.getInt(2);
			String destino = resultSet.getString(3);
			String custo = resultSet.getString(4);
			String data = resultSet.getString(5);
			
			
			Viagem viagem = new Viagem(id,destino,custo,data);
			return viagem;
		}
		return null;
	}

	
	public boolean existe(int idViagem) {
		
		return false;
	}

	@Override
	public ArrayList<Viagem> listar() throws SQLException {
      ArrayList<Viagem> list = new ArrayList<>();
		
		String sql = "select*from Viagem";
		PreparedStatement prepareStatement = conec.prepareStatement(sql);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		
		while(resultSet.next()){
			int  id = resultSet.getInt(2);
			String destino = resultSet.getString(3);
			String custo = resultSet.getString(4);
			String data = resultSet.getString(5);
			
			Viagem viagem = new Viagem(id,destino,custo,data);
			list.add(viagem);
		}
		return list;
	}


	
}


