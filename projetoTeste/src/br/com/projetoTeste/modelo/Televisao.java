package br.com.projetoTeste.modelo;

public class Televisao {
	private String marca;
	private float valorVenda;
	private float valorCompra;
	private int volume;
	private int canal;
	private boolean status;
	
	public void preencherMarca (String pMarca) {
		marca = pMarca;
	}

	public void preencherValorCompra (float pValor) {
		valorCompra=pValor;
	}
	
	public String definirValorVenda () {
		valorVenda = valorCompra * (float)1.2;
		return "Valor de venda é: " + valorVenda;
	}
	
	
	public void ligar () {
		status = true;
	}
	
	public void desligar () {
		status=false;
		volume=0;
	}
	public String retornarStatus () {
		if (status==true) {
			return "Ligada";
		}else {
			return "Desligada";
		}
	}
	
	public void aumentarVolume () {
		if (status==true && volume<=20) {
			volume = volume + 1;
		}
	}
	
	public void diminuirVolume () {
		if (status==true && volume!=0) {
			volume = volume - 1;
		}
	}
	
	public void mudarCanal (int pCanal) {
		if (status==true && (pCanal<=999 &&pCanal >0)) {
			canal = pCanal;
		}
	}
	
	public String retornarResumo () {
		return 
				"Marca: " + marca + "\n" +
				"Status: " + status + "\n" +
				"Canal: " + canal + "\n" +
				"Volume: " + volume + "\n" +
				"Valor de Venda: " + valorVenda + "\n" +
				"Valor de Compra: " + valorCompra;
	}












}//fecha classe
