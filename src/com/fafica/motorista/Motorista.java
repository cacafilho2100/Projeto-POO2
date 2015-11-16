package com.fafica.motorista;

public class Motorista {

	private int idMotorista;
	private String nomeMotorista;
	private String cpfMotorista;
	private String enderecoMotorista;
	private String salarioMotorista;
	private String telefoneMotorista;
	
	public Motorista(String nomeMotorista,
			String cpfMotorista, String enderecoMotorista,
			String salarioMotorista, String telefoneMotorista){
		
		this.nomeMotorista = nomeMotorista;
		this.cpfMotorista = cpfMotorista;
		this.enderecoMotorista = enderecoMotorista;
		this.salarioMotorista = salarioMotorista;
		this.telefoneMotorista = telefoneMotorista;
		
	}
	
	public Motorista(int idMotorista, String nomeMotorista,
			String cpfMotorista, String enderecoMotorista,
			String salarioMotorista, String telefoneMotorista) {
		
		this.idMotorista = idMotorista;
		this.nomeMotorista = nomeMotorista;
		this.cpfMotorista = cpfMotorista;
		this.enderecoMotorista = enderecoMotorista;
		this.salarioMotorista = salarioMotorista;
		this.telefoneMotorista = telefoneMotorista;
	}

	public int getIdMotorista() {
		return idMotorista;
	}

	public void setIdMotorista(int idMotorista) {
		this.idMotorista = idMotorista;
	}

	public String getNomeMotorista() {
		return nomeMotorista;
	}

	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}

	public String getCpfMotorista() {
		return cpfMotorista;
	}

	public void setCpfMotorista(String cpfMotorista) {
		this.cpfMotorista = cpfMotorista;
	}

	public String getEnderecoMotorista() {
		return enderecoMotorista;
	}

	public void setEnderecoMotorista(String enderecoMotorista) {
		this.enderecoMotorista = enderecoMotorista;
	}

	public String getSalarioMotorista() {
		return salarioMotorista;
	}

	public void setSalarioMotorista(String salarioMotorista) {
		this.salarioMotorista = salarioMotorista;
	}

	public String getTelefoneMotorista() {
		return telefoneMotorista;
	}

	public void setTelefoneMotorista(String telefoneMotorista) {
		this.telefoneMotorista = telefoneMotorista;
	}

	@Override
	public String toString() {
		return "Motorista [idMotorista= " + idMotorista + ", nomeMotorista= "
				+ nomeMotorista + ", cpfMotorista= " + cpfMotorista
				+ ", enderecoMotorista= " + enderecoMotorista
				+ ", salarioMotorista= " + salarioMotorista
				+ ", telefoneMotorista= " + telefoneMotorista + "]";
	}

}
