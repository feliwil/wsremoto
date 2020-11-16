package br.com.excecoes.tratamento;

import java.sql.SQLException;

public class MInhaExcecao {
	public static String tratar (Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto está nulo";
		} else if (e instanceof NumberFormatException) {
			return "Número Invalido";
		
		} else if (e instanceof SQLException) {
			return "Erro no banco de dados";
		} else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
					
		}else {
			e.printStackTrace();
			return "Exceção nao tratada";
			//throw new RuntimeException();
		}
	}

	
	
}
