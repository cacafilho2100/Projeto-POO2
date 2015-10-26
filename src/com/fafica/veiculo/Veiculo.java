package com.fafica.veiculo;

public class Veiculo {
	
	private int quantPassageiro;
	private String modelo;
	private String placa;
	private String chassi;
	private String cor;
	private String ano;
	
	public Veiculo(int quantPassageiro,String modelo, String placa, String chassi, String cor, String ano){
		this.setQuantPassageiro(quantPassageiro);
		this.setModelo(modelo);
		this.setPlaca(placa);
		this.setChassi(chassi);
		this.setCor(cor);
		this.setAno(ano);
	}
	
	public int quantPassageiro(){
		return quantPassageiro;
	}
	public void setQuantPassageiro(int quantPassageiro){
		this.quantPassageiro = quantPassageiro;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return "Veiculo [ quantPassageiro=" + quantPassageiro + "modelo=" + modelo + ", placa=" + placa + ", chassi="
				+ chassi + ", cor=" + cor + ", ano=" + ano + "]";
	}
	

}
