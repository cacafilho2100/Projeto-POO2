package com.fafica.main;

import java.io.IOException;
import java.sql.SQLException;

import com.fafica.fachada.Fachada;
import com.fafica.funcionario.CPFInvalidoException;
import com.fafica.funcionario.Funcionario;
import com.fafica.funcionario.FuncionarioJaCadastradoException;
import com.fafica.funcionario.FuncionarioNaoEncontradoException;
import com.fafica.util.CampoObrigatorioInvalidoException;

public class TelaFuncionario {

	public static void main(String[] args) throws CPFInvalidoException, FuncionarioNaoEncontradoException, ClassNotFoundException, SQLException, IOException {
		Fachada fachada = Fachada.getInstance();
		
		Funcionario funcionario01 = new Funcionario("astoufo","rua da peda","071.611.844-01","funfun@gmail.com","1234567");
		Funcionario funcionario02 = new Funcionario("maria","fim do mundo","754.621.443-26","maria@gmail.com","32165498");
		Funcionario funcionario03 = new Funcionario("sorte","perto","754.621.443-26","sorte@hotmail.com","123456789");
		
		
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try {
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(fachada.procurarFuncionario("071.611.844-01"));
		} catch (FuncionarioNaoEncontradoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
		fachada.atualizarFuncionario(funcionario03);
		System.out.println("Funcionario foi Atualizado");
	} catch (FuncionarioNaoEncontradoException e) {
		// TODO Auto-generated catch block
		e.getMessage();
	} catch (CPFInvalidoException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (CampoObrigatorioInvalidoException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.getMessage();
	}
		
		try {
			System.out.println(fachada.listarFuncionario());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.getMessage();
		}
		//System.out.println(fachada.existeFuncionario("071.611.844-01"));
		
		try {
			fachada.remorverFuncionario("071.611.844-01");
			System.out.println("foi removido com sucesso");
		} catch (CPFInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CampoObrigatorioInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FuncionarioNaoEncontradoException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		try {
			System.out.println(fachada.listarFuncionario());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}


