package com.fafica.fornecedor;

public class Fornecedor {
	
	private Integer idFornecedor;
	private String nomeFornecedor;
	private String enderecoFornecedor;
	private String cpfFornecedor;
	private String emailFornecedor;
	private String telefoneFornecedor;
	
	public Fornecedor (Integer idFornecedor, String nomeFornecedor, String enderecoFornecedor, String cpfFornecedor, String emailFornecedor,String telefoneFornecedor){
		this.setIdFornecedor(idFornecedor);
		this.setNomeFornecedor(nomeFornecedor);
		this.setEnderecoFornecedor(enderecoFornecedor);
		this.setCpfFornecedor(cpfFornecedor);	
		this.setEmailFornecedor(emailFornecedor);
		this.setTelefoneFornecedor(telefoneFornecedor);
	
	}

	public Integer getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Integer idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getEnderecoFornecedor() {
		return enderecoFornecedor;
	}

	public void setEnderecoFornecedor(String enderecoFornecedor) {
		this.enderecoFornecedor = enderecoFornecedor;
	}

	public String getCpfFornecedor() {
		return cpfFornecedor;
	}

	public void setCpfFornecedor(String cpfFornecedor) {
		this.cpfFornecedor = cpfFornecedor;
	}

	public String getEmailFornecedor() {
		return emailFornecedor;
	}

	public void setEmailFornecedor(String emailFornecedor) {
		this.emailFornecedor = emailFornecedor;
	}

	public String getTelefoneFornecedor() {
		return telefoneFornecedor;
	}

	public void setTelefoneFornecedor(String telefoneFornecedor) {
		this.telefoneFornecedor = telefoneFornecedor;
	}

	@Override
	public String toString() {
		return "Fornecedor [idFornecedor=" + idFornecedor + ", nomeFornecedor="
				+ nomeFornecedor + ", enderecoFornecedor=" + enderecoFornecedor
				+ ", cpfFornecedor=" + cpfFornecedor + ", emailFornecedor="
				+ emailFornecedor + ", telefoneFornecedor="
				+ telefoneFornecedor + "]";
	}
	
	

}
