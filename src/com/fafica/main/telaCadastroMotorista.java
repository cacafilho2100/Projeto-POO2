package com.fafica.main;
import java.util.ArrayList;
import com.fafica.fachada.Fachada;
import com.fafica.motorista.Motorista;
import com.fafica.motorista.MotoristaJaCadastradoException;
import com.fafica.motorista.MotoristaNaoEncontradoException;
import com.fafica.util.CampoObrigatorioInvalidoException;

public class telaCadastroMotorista {

	public static void main(String[] args)throws MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException {
		Fachada fachada = Fachada.getInstance();

	
       //Motorista motorista2 = new Motorista(12, "Doido", "108.", "Rua 00", "1.000,00", "99885-4894");
	   //fachada.cadastrarMotorista(motorista2);
		//System.out.println(motorista2);
		
		//Motorista motorista3 = new Motorista(2, "vvv", "178.522.668-55", "Rua 88", "1.000,00", "99885-4894");
		//fachada.cadastrarMotorista(motorista3);
		//System.out.println(motorista3);
		
		
		//ArrayList<Motorista> motoristas = fachada.listarMotorista();
		//for(Motorista m : motoristas){
		///	System.out.println(m);
			//
			
		//}
		
		Motorista motorista = new Motorista(1," Victor","884.592.667-85","Rua 89","90.000,00","3714-9874");
		//System.out.println(motorista);
		try {
			fachada.cadastrarMotorista(motorista);
			System.out.println("cadastrado com sucesso");
		} catch (IllegalArgumentException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (MotoristaJaCadastradoException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (CampoObrigatorioInvalidoException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
 
	   Motorista motorista21 = new Motorista(6, "Julio", "88888", "rua", "100", "99999-99999");
	   fachada.cadastrarMotorista(motorista21);
	
		Motorista motorista1 = new Motorista(2," Victor","884.592.667-85","Rua 89","90.000,00","3714-9874");
		fachada.cadastrarMotorista(motorista1);
		//System.out.println(motorista);
/*
		try {
			fachada.cadastrarMotorista(motorista1);
			System.out.println("cadastrado com sucesso");
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MotoristaJaCadastradoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CampoObrigatorioInvalidoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*
		try{
			fachada.atualizarMotorista(motorista);
			System.out.println("Funcionario foi Atualizado");
		}catch( MotoristaNaoEncontradoException e ){
			e.printStackTrace();
			
		}
		
		/*
		Motorista motorista2 = new Motorista(2,"Felipe","108.522.668-55","Rua 21","10.000,00","3789-6570");
		//fachada.cadastrarMotorista(motorista8);
		//System.out.println(motorista2);
		try {
			fachada.cadastrarMotorista(motorista2);
			System.out.println("cadastrado com sucesso");
		} catch (IllegalArgumentException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (MotoristaJaCadastradoException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (CampoObrigatorioInvalidoException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		

		/*
		Motorista motorista3 = new Motorista(3,"juliano","889.545.123-89","Rua 71","1.000,00","3150-8754");
		//fachada.cadastrarMotorista(motorista8);
		System.out.println(motorista3);
		try {
			fachada.cadastrarMotorista(motorista3);
			System.out.println("cadastrado com sucesso");
		} catch (IllegalArgumentException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		} catch (MotoristaJaCadastradoException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		} catch (CampoObrigatorioInvalidoException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		*/
		
		
		
		//System.out.println(fachada.removerMotorista(2));
		
		System.out.println(fachada.existeMotorista(6));
		
	   System.out.println(fachada.procurarMotorista(6));
		
		
		
		/*
		try {
			System.out.println(fachada.procurarMotorista(1));
		} catch (MotoristaNaoEncontradoException e) {
			//TODO Auto-generated catch block
		   System.out.println(e.getMessage());
		}
		/*
		try {
			System.out.println(fachada.procurarMotorista(2));
		} catch (MotoristaNaoEncontradoException t) {
			//TODO Auto-generated catch block
		   System.out.println(t.getMessage());
		}
		/*
		try {
			System.out.println(fachada.procurarMotorista(3));
		} catch (MotoristaNaoEncontradoException y) {
			//TODO Auto-generated catch block
		   System.out.println(y.getMessage());
		}
		*/
		
		/*
		try{
			fachada.atualizarMotorista(motorista2);
			System.out.println("Funcionario foi Atualizado");
		}catch( MotoristaNaoEncontradoException e ){
			e.printStackTrace();
			
		}
		*/
/*
		ArrayList<Motorista> motoristas = fachada.listarMotorista();
		for(Motorista m: motoristas) {
			System.out.println(m);
		}
	

		/*try {
			fachada.atualizarMotorista(motorista);
			System.out.println("Funcionario foi Atualizado");
		} catch (MotoristaNaoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
	
	
   }	
	
}	
	

