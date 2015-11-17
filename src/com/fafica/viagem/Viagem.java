package com.fafica.viagem;

import com.fafica.motorista.Motorista;

public class Viagem {
	
	
	private int idViagem;
	private String destino;
	private String custo;
	private String data;
	//private Motorista motorista;
	
	
	/*
	public Viagem(String destino, String custo, String data){
		//this.setMotorista(motorista);
		this.setDestino(destino);
		this.setCusto(custo);	
		this.setData(data);
	}
	*/		
	
	public Viagem(int idViagem, String destino, String custo, String data){
		//this.setMotorista(motorista);
		this.setIdViagem(idViagem);
		this.setDestino(destino);
		this.setCusto(custo);	
		this.setData(data);
	}

/*
	public Motorista getMotorista(){
		return motorista;
	}
	
	public void setMotorista(Motorista motorista){
		this.motorista = motorista;
	}

*/
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
	
	public int getIdViagem(){
		return idViagem;
	}
	
	public void setIdViagem(int idViagem){
		this.idViagem = idViagem;
	}
	
	public String data(){
		return data;
	}
	
	public void setData(String data){
		this.data = data;
	}
	

	@Override
	public String toString() {
		return "Viagem [ idViagem = "+ idViagem + " destino= " + destino + ", custo = " + custo + " data = " + data + "]";
	}
	
	
	

}
