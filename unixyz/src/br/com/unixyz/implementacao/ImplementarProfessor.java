package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor {

	public static void main(String[] args) {
		Professor p = new Professor ();
		Endereco e= new Endereco ();
		
		p.setId(1);
		p.setNome("Pascoalli");
		p.setTitulacao("Doutor" );
		p.setFone("1234-5678");
		p.setEndereco(e);
		e.setLogradouro("Av Paulista");
		e.setNumero("123");
		e.setBairro("Centro");
		e.setCidade("Sao Paulo");
		e.setUf("SP");
		e.setCep("0000-000");
		e.setComplemento(false);
		System.out.println("Nome: " + p.getNome());
		System.out.println("Endere�o: " + p.getEndereco().getAll()	);
				
			

	}

}
