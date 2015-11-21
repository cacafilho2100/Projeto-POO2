package com.fafica.main;

import com.fafica.fachada.Fachada;
import com.fafica.util.CampoObrigatorioInvalidoException;
import com.fafica.veiculo.Veiculo;
import com.fafica.veiculo.VeiculoJaCadastradoException;
import com.fafica.veiculo.VeiculoNaoEncontradoException;

public class TelaVeiculo {

	public static void main(String[] args) throws ClassNotFoundException {
		Fachada fachada = Fachada.getInstance();
		
		Veiculo veiculo1 = new Veiculo(01,20,"onibus","kha-2100","123456","Amarelo",2000);
		Veiculo veiculo2 = new Veiculo(01,30,"van","kah-1512","789456","branca",2003);
		Veiculo veiculo3 = new Veiculo(03,50,"onibus","jpg-1234","456123","azul",2015);
		
		try {
			fachada.cadastrarVeiculo(veiculo1);
			System.out.println("cadastrado Com Sucesso");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (VeiculoJaCadastradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CampoObrigatorioInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fachada.atualizarVeiculo(veiculo2);
			System.out.println("veiculo Atualizado");
		} catch (VeiculoNaoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CampoObrigatorioInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fachada.cadastrarVeiculo(veiculo3);
			System.out.println("veiculo cadastrado");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (VeiculoJaCadastradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CampoObrigatorioInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(fachada.existeVeiculo(03));
		
		try {
			fachada.removerVeiculo(01);
			System.out.println("foi Removido");
		} catch (VeiculoNaoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(fachada.procurarVeiculo(03));
		} catch (VeiculoNaoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(fachada.listarVeiculo());
		
	
		
	}

}
