package com.fafica.main;

import com.fafica.fachada.Fachada;
import com.fafica.funcionario.CPFInvalidoException;
import com.fafica.funcionario.Funcionario;
import com.fafica.funcionario.FuncionarioJaCadastradoException;
import com.fafica.funcionario.FuncionarioNaoEncontradoException;
import com.fafica.util.CampoObrigatorioInvalidoException;

public class TelaFuncionario {

	public static void main(String[] args) {
		Fachada fachada = Fachada.getInstance();
		
		Funcionario funcionario01 = new Funcionario(81,"astoufo","rua da peda","123","funfun@gmail.com","1234567");
		try {
			fachada.cadastrarFuncionario(funcionario01);
			System.out.println("cadastrado com sucesso");
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CPFInvalidoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (FuncionarioJaCadastradoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CampoObrigatorioInvalidoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Funcionario funcionario02 = new Funcionario(9,"astoufo","rua da peda","891","funfun@gmail.com","1234567");
		try {
			fachada.cadastrarFuncionario(funcionario02);
			System.out.println("cadastrado com sucesso");
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CPFInvalidoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (FuncionarioJaCadastradoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CampoObrigatorioInvalidoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			System.out.println(fachada.procurarFuncionario("891"));
		} catch (FuncionarioNaoEncontradoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
