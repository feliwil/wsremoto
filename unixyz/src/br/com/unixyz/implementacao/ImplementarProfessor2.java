package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor2 {

	public static void main(String[] args) {
		Professor p = new Professor ();
		Endereco e = new Endereco ();
		
		p.setAll(
				1, 
				"Pascoalli", 
				"Doutor", 
				"1234-5678", 
				e);
				e.setAll(
					"Av Paulista", "55", false, "Centro", "Sao Paulo", "SP", "1234-5678");
				
				System.out.println(p.getAll());
	

	}

}
