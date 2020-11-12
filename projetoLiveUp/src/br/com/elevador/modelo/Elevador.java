package br.com.elevador.modelo;

public class Elevador {
	private int andarAtual;
	private int andarMaximo=20;
	private int andarMinimo=0;
	private int capacidadePessoas=15;
	private int qtdePessoas;
	private String nome= "Projeto";
	
	
	public void entrar (int pQtde) {
		if (qtdePessoas + pQtde <= capacidadePessoas) {
			qtdePessoas = qtdePessoas + pQtde;
		}
		
	}
	
	public void sair (int pQde) {
		if (qtdePessoas-pQde >=0) {
			qtdePessoas = qtdePessoas - pQde;
		}
	}
	
	public void subir () {
		if (andarAtual + 1 < andarMaximo) {
			andarAtual= andarAtual +1;
		}
	}
	
	public void desce () {
		if (andarAtual - 1 >0) {
			andarAtual= andarAtual - 1;
	
		}
	}
	
	public String retornarTudo () {
		return 
				"Andar Atual: " + andarAtual + "\n" + 
				"Andar Maximo: " + andarMaximo + "\n" + 
				"Andar Minimo: " + andarMinimo + "\n" + 
				"Capacide de Pessoas: " + capacidadePessoas + "\n" + 
				"Quantidade de Pessoas: " + qtdePessoas + "\n" + 
				"Nome: " + nome + "\n";
	}
	
	
	
	
	
	
	
}
