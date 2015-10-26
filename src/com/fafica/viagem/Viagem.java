package com.fafica.viagem;

public class Viagem {
	
	private String destino;
	private String custo;
	
	public Viagem(String destino, String custo){
		this.setDestino(destino);
		this.setCusto(custo);	
	}
	
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getCusto() {
		return custo;
	}
	public void setCusto(String custo) {
		this.custo = custo;
	}

	@Override
	public String toString() {
		return "Viagem [destino=" + destino + ", custo=" + custo + "]";
	}
	
	
	

}
