package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set <String> lista = new HashSet<String>();

		lista.add("DBA");
		lista.add("ESTAGIARIO");
		lista.add("ANALISTA");
		lista.add("SUPORTE");
		lista.add("DBA");
		lista.add("FULL STACK");
		System.out.println(lista);
		System.out.println("existe dba? " + lista.contains("DBA"));
	}

}
