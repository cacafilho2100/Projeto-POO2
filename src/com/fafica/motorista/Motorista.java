package com.fafica.motorista;

public class Motorista {
	
	private String nome;
	private String cpf;
	private String endereco;
	
	public Motorista(String nome, String cpf, String endereco){
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Motorista [nome=" + nome + ", cpf=" + cpf + ", endereco="
				+ endereco + "]";
	}
	

}
