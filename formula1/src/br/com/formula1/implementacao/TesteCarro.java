package br.com.formula1.implementacao;

import br.com.formula1.modelo.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		Carro objeto = new Carro();
		
		/*
		objeto.preencherValor((float) 1000.0);
		System.out.println(objeto.retornarPromocao());
		objeto.preencherBasico(Short.parseShort(JOptionPane.showInputDialog("Digite o numero do carro: ")), JOptionPane.showInputDialog("Digite o nome da escuderia: "),Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do carro: ")));
		objeto.ligar();
		System.out.println(objeto.exibirTudo());
		System.out.println(objeto.retornarPromocao());
		*/
		objeto.ligar();
		objeto.acelerar((float) 50);
		System.out.println(objeto.exibirVelocidadeAtual());
		objeto.desacelerar((float)25);
		System.out.println(objeto.exibirVelocidadeAtual());
		objeto.brecar();
		System.out.println(objeto.exibirVelocidadeAtual());
		System.out.println(objeto.exibirStatus());
		objeto.desligar();
		System.out.println(objeto.exibirStatus());
		objeto.acelerar((float) 50);
		System.out.println(objeto.exibirVelocidadeAtual());
		 


	

		
		
		
		
	}
}
