package com.fafica.funcionario;

public class Funcionario {
	
	private Integer idFuncionario;
	private String nomeFuncionario;
	private String enderecoFuncionario;
	private String cpfFuncionario;
	private String emailFuncionario;
	private String telefoneFuncionario;
	
	public Funcionario(String nomeFuncionario, String enderecoFuncionario, String cpfFuncionario, String emailFncionario, String telefoneFuncionario){
	
		this.setTelefoneFuncionario(telefoneFuncionario);
		this.setNomeFuncionario(nomeFuncionario);
		this.setEnderecoFuncionario(enderecoFuncionario);
		this.setCpfFuncionario(cpfFuncionario);
		this.setEmailFuncionario(emailFuncionario);
		
	}
	
	public Funcionario(){
		this.idFuncionario = 0;
	}


	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getEnderecoFuncionario() {
		return enderecoFuncionario;
	}

	public void setEnderecoFuncionario(String enderecoFuncionario) {
		this.enderecoFuncionario = enderecoFuncionario;
	}

	public String getCpfFuncionario() {
		return cpfFuncionario;
	}

	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	public String getEmailFuncionario() {
		return emailFuncionario;
	}

	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}

	public String getTelefoneFuncionario() {
		return telefoneFuncionario;
	}

	public void setTelefoneFuncionario(String telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario= " + idFuncionario
				+ ", nomeFuncionario= " + nomeFuncionario
				+ ", enderecoFuncionario= " + enderecoFuncionario
				+ ", cpfFuncionario= " + cpfFuncionario + ", emailFuncionario= "
				+ emailFuncionario + ", telefoneFuncionario= "
				+ telefoneFuncionario + "]";
	}

	

}
