package br.com.excecoes.tratamento;

import java.sql.SQLException;

public class MInhaExcecao {
	public static String tratar (Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto est� nulo";
		} else if (e instanceof NumberFormatException) {
			return "N�mero Invalido";
		
		} else if (e instanceof SQLException) {
			return "Erro no banco de dados";
		} else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
					
		}else {
			e.printStackTrace();
			return "Exce��o nao tratada";
			//throw new RuntimeException();
		}
	}

	
	
}
