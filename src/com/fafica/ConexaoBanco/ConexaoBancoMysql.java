package com.fafica.ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoBancoMysql {
	
	public static void main(String[] args){
		
		String url = "jdbc:mysql://localhost/vlac";
		try{
			Connection con = DriverManager.getConnection(url,"root","system");
			String sql = "insert into funcionario(nome,idade)values('astoufo',14);";
			PreparedStatement insert = con.prepareStatement(sql);
			insert.execute();
			JOptionPane.showMessageDialog(null, "Execultado com sucesso!");
		}catch(SQLException e){
			e.getMessage();
		}
	}

}
