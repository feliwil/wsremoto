package br.com.elevador.implementacao;

import javax.swing.JOptionPane;

import br.com.elevador.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		Elevador objeto = new Elevador () ;
		
		objeto.entrar(Integer.parseInt(JOptionPane.showInputDialog("Digite quantas pessoas desejam entrar no elevador: ")));
		System.out.println(objeto.retornarTudo());
		
		objeto.subir();
		objeto.sair(Integer.parseInt(JOptionPane.showInputDialog("Digite quantas pessoas ir�o sair do elevador: ")));
	
		System.out.println(objeto.retornarTudo());
		objeto.subir();
		
	}

}