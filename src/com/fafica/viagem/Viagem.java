package com.fafica.viagem;

public class Viagem {
	
	
	private int idViagem;
	private String destino;
	private String custo;
	private String data;
	
	
	
	public Viagem(String destino, String custo, String data){
		this.setDestino(destino);
		this.setCusto(custo);	
		this.setData(data);
	}
			
	
	public Viagem(int idViagem, String destino, String custo, String data){
		this.setIdViagem(idViagem);
		this.setDestino(destino);
		this.setCusto(custo);	
		this.setData(data);
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
