package com.fafica.main;

import com.fafica.fachada.Fachada;
import com.fafica.util.CampoObrigatorioInvalidoException;
import com.fafica.viagem.Viagem;
import com.fafica.viagem.ViagemJaCadastradaException;
import com.fafica.viagem.ViagemNaoEncontradaException;

public class telaCadastroViagem {
	
       public static void main(String[] args) throws ViagemJaCadastradaException, ViagemNaoEncontradaException, CampoObrigatorioInvalidoException {
    	   Fachada fachada = Fachada.getInstance();
		
    	 /*  
    	 Viagem viagem = new Viagem(1 , "Recife", "300,00 ", " 01/10/2016"  );
   		//fachada.cadastrarViagem(viagem);
   		  System.out.println(viagem);
   		try {
   			fachada.cadastrarViagem(viagem);
   			System.out.println("cadastrado com sucesso");
   		} catch (IllegalArgumentException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		} catch (ViagemJaCadastradaException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		} catch (CampoObrigatorioInvalidoException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   		
   	 Viagem viagem2 = new Viagem(2, "Caruaru", "900,00 ", " 10/12/2015"  );
		//fachada.cadastrarViagem(viagem);
		  System.out.println(viagem2);
		try {
			fachada.cadastrarViagem(viagem2);
			System.out.println("cadastrado com sucesso");
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ViagemJaCadastradaException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CampoObrigatorioInvalidoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
   		
    	/*   
		try {
			System.out.println(fachada.procurarViagem(1));
		} catch (ViagemNaoEncontradaException e) {
			//TODO Auto-generated catch block
		   System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(fachada.procurarViagem(2));
		} catch (ViagemNaoEncontradaException t) {
			//TODO Auto-generated catch block
		   System.out.println(t.getMessage());
		}  
		*/
    	   Viagem viagem = new Viagem(1 , "Recife", "300,00 ", " 01/10/2016"  );
    	   fachada.cadastrarViagem(viagem);
    	   System.out.println(viagem);

    	   Viagem viagem2 = new Viagem(2 , "Caruaru", "200,00 ", " 25/12/2015"  );
    	   fachada.cadastrarViagem(viagem2);
    	   System.out.println(viagem2);
    	   
    	   Viagem viagem3 = new Viagem(3 , "salvador", "500,00 ", "21/11/2015"  );
    	   fachada.cadastrarViagem(viagem3);
    	   System.out.println(viagem3);
    	   
    	
    	   System.out.println(fachada.removerViagem(2));
   		
   		
    	   System.out.println(fachada.existeViagem(2));
   		
   		
    	   System.out.println(fachada.procurarViagem(2));
    	   
    	   //ArrayList<viagem>
    	   
    	   
    	   
    	 //System.out.println(fachada.procurarViagem(1));
    	 //System.out.println(fachada.procurarViagem(2));
    	 //System.out.println(fachada.procurarViagem(3));
    	 
    	 //fachada.removerViagem(10);
    	 //System.out.println(fachada.removerViagem(1));
   	
   		 //System.out.println(fachada.existeViagem(1));
       
       }

}
