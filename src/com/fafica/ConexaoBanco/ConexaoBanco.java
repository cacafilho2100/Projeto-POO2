package com.fafica.ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoBanco {
	
	
	public static Connection conexaoBanco() throws ClassNotFoundException{
		try{
			Class.forName("org.postgresql.Driver");
			Connection connec = DriverManager.getConnection("jdbc:postegresql://localhost:5432/vlacTurismos","system","system");
			System.out.println("conectado bd");
			return connec;
		}
		catch(SQLException erro){
			
			JOptionPane.showMessageDialog(null,erro);
			return null;
			
		}
	}

}
