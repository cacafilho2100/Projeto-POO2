package com.fafica.main;


import java.util.ArrayList;
import java.util.List;
import com.fafica.fachada.Fachada;
import com.fafica.motorista.Motorista;
import com.fafica.motorista.MotoristaJaCadastradoException;
import com.fafica.motorista.MotoristaNaoEncontradoException;
import com.fafica.util.CampoObrigatorioInvalidoException;


public class telaCadastroMotorista {

	public static void main(String[] args)throws MotoristaJaCadastradoException, MotoristaNaoEncontradoException, CampoObrigatorioInvalidoException {
		Fachada fachada = Fachada.getInstance();

		Motorista motorista = new Motorista(10, "Victor", "108.522.668-55", "Rua 88", "1.000,00", "99885-4894");
		fachada.cadastrarMotorista(motorista);
		//System.out.println(motorista);


		Motorista motorista2 = new Motorista(12, "Victor", "108.522.668-55", "Rua 88", "1.000,00", "99885-4894");
		fachada.cadastrarMotorista(motorista2);
		//System.out.println(motorista2);
		
		//Motorista motorista3 = new Motorista(80, "joão", "108.522.668-55", "Rua 88", "1.000,00", "99885-4894");
		//fachada.cadastrarMotorista(motorista3);
		//System.out.println(motorista3);
		
		List list =  new ArrayList();
		list.add(10);
		
		
		List<Motorista> motorista1 = fachada.listarMotorista();
		for(Motorista m: motorista1) {
			System.out.println(m);
		}
		
		//fachada.removerMotorista(10);
		//System.out.println("Após a Remoção");
		//motorista = fachada.listarMotorista();
		//for(Motorista m: motorista) {
			//System.out.println(m);
		//}
		
		
		
		//fachada.removerMotorista(80);
	   // System.out.println("removeu");
	
	}
}	

