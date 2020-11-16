package br.com.colecoes.implementacao;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map<Integer, String> lista = new HashMap<Integer,String> ();
		lista.put(5505,"DBA");
		lista.put(5506,"DBA");
		lista.put(5530,"ANALISTA");
		lista.put(5599,"ESTAGIÁRIO");
		System.out.println(lista);
		System.out.println("Chaves: " + lista.keySet());
		System.out.println("Valores: " + lista.values());

	}

}
