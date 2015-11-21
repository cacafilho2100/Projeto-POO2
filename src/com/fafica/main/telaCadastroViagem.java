package com.fafica.main;

import java.util.ArrayList;

import com.fafica.fachada.Fachada;
import com.fafica.util.CampoObrigatorioInvalidoException;
import com.fafica.viagem.Viagem;
import com.fafica.viagem.ViagemJaCadastradaException;
import com.fafica.viagem.ViagemNaoEncontradaException;

public class telaCadastroViagem {
	
       public static void main(String[] args) throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException, ClassNotFoundException {
    	   Fachada fachada = Fachada.getInstance();
		
    	
    	 Viagem viagem = new Viagem(1 , "Recife", "300,00 ", " 01/10/2016"  );
   		//fachada.cadastrarViagem(viagem);
   		  //System.out.println(viagem);
   		try {
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

   		}
   	/*
   	 Viagem viagem2 = new Viagem(1, "Caruaru", "900,00 ", " 10/12/2015"  );
		//fachada.cadastrarViagem(viagem);
		  //System.out.println(viagem2);
		try {
			//System.out.println("Cadastrado com sucesso");
			fachada.cadastrarViagem(viagem2);
		} catch (IllegalArgumentException e1) {
			System.out.println(e1.getMessage());
			
		} catch (ViagemJaCadastradaException e1) {
			System.out.println(e1.getMessage());
			
		} catch (CampoObrigatorioInvalidoException e1) {
			System.out.println(e1.getMessage());
			
		}
		
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
       
       }

}
