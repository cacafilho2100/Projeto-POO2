package com.fafica.veiculo;

public class Veiculo {
	
	private Integer idVeiculo;
	private Integer quantPassageiro;
	private String modelo;
	private String placa;
	private String chassi;
	private String cor;
	private Integer ano;
	
	public Veiculo(Integer idVeiculo, Integer quantPassageiro,String modelo, String placa, String chassi, String cor, Integer ano){
		this.setIdVeiculo(idVeiculo);
		this.setQuantPassageiro(quantPassageiro);
		this.setModelo(modelo);
		this.setPlaca(placa);
		this.setChassi(chassi);
		this.setCor(cor);
		this.setAno(ano);
	}
	
	public Veiculo(String modelo, String placa, String chassi, String cor){
		this.setModelo(modelo);
		this.setPlaca(placa);
		this.setChassi(chassi);
		this.setCor(cor);
	}
	
	
	public Veiculo(int parseInt, String string, String modelo2, String placa2, String chassi2, String cor2,
			String string2) {
		// TODO Auto-generated constructor stub
	}

	public void setIdVeiculo(Integer idVeiculo){
		this.idVeiculo = idVeiculo;
	}
	
	public Integer getQuantPassageiro(){
		return quantPassageiro;
	}
	public void setQuantPassageiro(Integer quantPassageiro){
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
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return "Veiculo [idVeiculo= "+ idVeiculo +" quantPassageiro= " + quantPassageiro + "modelo= " + modelo + ", placa= " + placa + ", chassi= "
				+ chassi + ", cor= " + cor + ", ano= " + ano + "]";
	}


	public Integer getidVeiculo() {
		// TODO Auto-generated method stub
		return idVeiculo;
	}
	

}
