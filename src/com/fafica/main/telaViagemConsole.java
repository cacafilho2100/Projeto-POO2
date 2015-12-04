package com.fafica.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fafica.ConexaoBanco.ConexaoBancoMysql;
import com.fafica.fachada.Fachada;
import com.fafica.motorista.Motorista;
import com.fafica.util.CampoObrigatorioInvalidoException;
import com.fafica.veiculo.Veiculo;
import com.fafica.viagem.Viagem;
import com.fafica.viagem.ViagemJaCadastradaException;
import com.fafica.viagem.ViagemNaoEncontradaException;


public class telaViagemConsole {
	
       public static void main(String[] args) throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException, ClassNotFoundException, SQLException {
    	   Fachada fachada = Fachada.getInstance();
    	   
    	   Connection conn  = ConexaoBancoMysql.conexaoBanco();
		
    	
    	 Viagem viagem = new Viagem(1 , "Recife", "300,00 ", " 01/10/2016" );
    	 Motorista motorista = new Motorista(12, "Doido", "108.", "Rua 00", "1.000,00", "99885-4894");
    	 Veiculo veiculo1 = new Veiculo(01,20,"onibus","kha-2100","123456","Amarelo",2000);
    	 viagem.setMotorista(motorista);
    	 viagem.setVeiculo(veiculo1);
   		 //fachada.cadastrarViagem(viagem);
   		  //System.out.println(viagem);
   	/*	try {
   			fachada.cadastrarViagem(viagem);
   			//System.out.println(" cadastrado com sucesso");
   		} catch (IllegalArgumentException e) {
   			// TODO Auto-generated catch block
   			System.out.println(e.getMessage());
   		} catch (ViagemJaCadastradaException e) {
   			// TODO Auto-generated catch block
   			System.out.println(e.getMessage());

   		} catch (CampoObrigatorioInvalidoException e) {
   			// TODO Auto-generated catch block
   			System.out.println(e.getMessage());

   		}*/
  
   	 Viagem viagem2 = new Viagem(2, "Caruaru", "900,00 ", " 10/12/2015"  );
   	 Motorista motorista2 = new Motorista(1," Victor","884.592.667-85","Rua 89","90.000,00","3714-9874");
   	 Veiculo veiculo2 = new Veiculo(01,30,"van","kah-1512","789456","branca",2003);
   	 viagem.setMotorista(motorista2);
   	 viagem.setVeiculo(veiculo2);
		//fachada.cadastrarViagem(viagem);
		  //System.out.println(viagem2);
		/*try {
			//System.out.println("Cadastrado com sucesso");
			fachada.cadastrarViagem(viagem2);
		} catch (IllegalArgumentException e1) {
			System.out.println(e1.getMessage());
			
		} catch (ViagemJaCadastradaException e1) {
			System.out.println(e1.getMessage());
			
		} catch (CampoObrigatorioInvalidoException e1) {
			System.out.println(e1.getMessage());
			
		}*/
		
		 //System.out.println(fachada.removerViagem(1));
		/*
		try{
			fachada.atualizarViagem(viagem2);
			System.out.println("Funcionario foi Atualizado");
		}catch( ViagemNaoEncontradaException e ){
			e.printStackTrace();
			
		}
   		
    	/*   
		try {
			System.out.println(fachada.procurarViagem(1));
		} catch (ViagemNaoEncontradaException e) {
			//TODO Auto-generated catch block
		   System.out.println(e.getMessage());
		}
		*/
		/*
		try {
			System.out.println(fachada.procurarViagem(1));
		} catch (ViagemNaoEncontradaException t) {
			//TODO Auto-generated catch block
		   System.out.println(t.getMessage());
		}  
		
    	 /*  Viagem viagem = new Viagem(1 , "Recife", "300,00 ", " 01/10/2016"  );
    	   fachada.cadastrarViagem(viagem);
    	   System.out.println(viagem);

    	   Viagem viagem2 = new Viagem(2 , "Caruaru", "200,00 ", " 25/12/2015"  );
    	   fachada.cadastrarViagem(viagem2);
    	   System.out.println(viagem2);
    	   
    	   Viagem viagem3 = new Viagem(3 , "salvador", "500,00 ", "21/11/2015"  );
    	   fachada.cadastrarViagem(viagem3);
    	   System.out.println(viagem3);
    	   */
    	
    	  //System.out.println(fachada.removerViagem(1));
    	  //System.out.println(fachada.removerViagem(2));
   		
   		
    	  // System.out.println(fachada.existeViagem(1));
   		
   		
    	  // System.out.println(fachada.procurarViagem(1));
    	/*   
		ArrayList<Viagem> viagem = fachada.listarViagem();
		for(Viagem v: viagem) {
			System.out.println(v);
		}
    	   */
    	   
    	   
    	 //System.out.println(fachada.procurarViagem(1));
    	 //System.out.println(fachada.procurarViagem(1));
    	 //System.out.println(fachada.procurarViagem(3));
    	 
    	 //fachada.removerViagem(10);
    	 //System.out.println(fachada.removerViagem(1));
   	
   		 //System.out.println(fachada.existeViagem(1));
   	 
   	/*try{
     PreparedStatement subSelect = conn.prepareStatement("select destino, data from viagem where destino ='Recife'and idViagem = (select idViagem from viagemwhere idViagem = 1)");
     ResultSet resultado = subSelect.executeQuery(); 
     while(resultado.next()){
    	 String destino = resultado.getString("destino");
    	 String data = resultado.getString("data");
    	 System.out.println("Destino = "+destino+" data = "+data);
     }
    }catch(SQLException e){
    	e.getMessage();
    }*/
   	
   	/*try{ 
   	PreparedStatement subdelet = conn.prepareStatement("delete from viagem where idViagem = (select idViagem  from viagem where idViagem = 1 )");
   	subdelet.executeUpdate(); 
   	}catch(SQLException e){
   		e.getMessage();
   	} */
   	 
   	 /*try{
   	 PreparedStatement ijoin = conn.prepareStatement("select motorista.idMotorista, motorista.nomeMotorista, viagem.idViagem, viagem.destino, viagem.data, viagem.custo from motorista inner join viagem on viagem.idMotorista = motorista.idMotorista;");
   	 ResultSet  resultado1 = ijoin.executeQuery();
   	 while(resultado1.next()){
   		 int idMotorista = resultado1.getInt("idMotorista");
   		 String nomeMotorista = resultado1.getString("nomeMotorista");
   		 int idViagem = resultado1.getInt("idViagem");
   		 String destino = resultado1.getString("destino");
   		 String data = resultado1.getString("data");
   		 String custo = resultado1.getString("custo");
   		 System.out.println("idMotorista = "+idMotorista+" nomeMotorista = "+nomeMotorista+" idViagem = "+idViagem+" destino = "+destino+" data = "+data+" custo = "+custo);
   	 }
   	 }catch(SQLException e){
   		 e.getMessage();
   	 }*/
   	 
   	/* try{
   	 PreparedStatement ojoin = conn.prepareStatement("select veiculo.placa ,veiculo.modelo, viagem.data, viagem.destino from veiculo full outer join viagem on viagem.idVeiculo = veiculo.idVeiculo");
   	 ResultSet resultado2 = ojoin.executeQuery();
   	 while(resultado2.next()){
   		 String placa = resultado2.getString("placa");
   		 String modelo = resultado2.getString("modelo");
   		 String data = resultado2.getString("data");
   		 String destino = resultado2.getString("destino");
   		 System.out.println("placa = "+placa+" modelo = "+modelo+" data = "+data+" destino = "+destino);
   	 }
       }catch(SQLException e){
    	   e.getMessage();
       }*/
       }

}
