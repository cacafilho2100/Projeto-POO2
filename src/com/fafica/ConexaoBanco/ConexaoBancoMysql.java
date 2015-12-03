package com.fafica.ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoBancoMysql {
	
	
		
		static String url = "jdbc:mysql://localhost/vlac";
		
		public static Connection conexaoBanco(){
			try{
				Connection con = DriverManager.getConnection(url,"root","system");
				JOptionPane.showMessageDialog(null, "Execultado com sucesso!");
				return con;
				}catch(SQLException e){
					e.getMessage();
					return null;
				}
		}

}
