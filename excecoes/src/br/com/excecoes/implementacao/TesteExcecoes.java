package br.com.excecoes.implementacao;

import br.com.excecoes.tratamento.MInhaExcecao;

public class TesteExcecoes {

	public static void main(String[] args) {
		try {
			int numero = Integer.parseInt("5");
			System.out.println(numero);
			String nome = "";
			System.out.println("Qtde de Letras " + nome.length());
			double vetor[] = new double[2];
			vetor[0]=5.54;
			vetor[1]=6.12;
			vetor[2]=15.8;
	
		}catch (Exception e) {
			System.out.println(MInhaExcecao.tratar(e));
		} finally {
			System.out.println("Ate logo");
		}








	}

}
