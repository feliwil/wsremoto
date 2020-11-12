package br.com.unixyz.implementacao;


import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor3 {

	public static void main(String[] args) {
		Professor p = new Professor (
				1,
				"Pascoali",
				"Doutor",
				"1234-5678",
				new Endereco(
						"Av Paulista",
						"55",
						false,
						"Centro",
						"Sao Paulo",
						"SP",
						"000-000"
						)
				);
		System.out.println(p.getAll());
	
	}

}
