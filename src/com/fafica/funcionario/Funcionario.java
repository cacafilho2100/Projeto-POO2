package com.fafica.funcionario;

public class Funcionario {
	
	private String nome;
	private String endereco;
	private String cpf;
	
	public Funcionario(String nome, String endereco, String cpf){
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setCpf(cpf);	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", endereco=" + endereco
				+ ", cpf=" + cpf + "]";
	}
	
	
	

}
