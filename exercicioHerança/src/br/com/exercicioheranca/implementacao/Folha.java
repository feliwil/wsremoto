package br.com.exercicioheranca.implementacao;

import java.util.ArrayList;

import br.com.exercicioheranca.beans.Chefe;
import br.com.exercicioheranca.beans.Comissionado;
import br.com.exercicioheranca.beans.Empreiteiro;
import br.com.exercicioheranca.beans.Funcionario;
import br.com.exercicioheranca.beans.Horista;

public class Folha {

	public static void main(String[] args) {
		ArrayList<Funcionario> lista;
		lista=new ArrayList <Funcionario>();
		lista.add(new Chefe ("Regina", 1001, 8000.f, 12.5f, 350.0f));
		lista.add(new Chefe ("Marcos", 1001, 8000.f, 12.5f, 350.0f));
		lista.add(new Horista("Isido",1002,1003,12));
		lista.add(new Horista("Joao",1002,1003,12));
		lista.add(new Comissionado("Reanto",1003,2000,10));
		lista.add(new Comissionado("Renato",1003,4000,10));
		lista.add(new Empreiteiro("Marcello",1004,2000));
	
		for(int pos=0; pos <lista.size();pos++) {
			Funcionario f =lista.get(pos);
			System.out.printf("%d  %-30s  R$ %9.2f%n", f.getNumeroRegistro(), f.getNome(), f.calcularSalario());
		}
		
		
		
	
		
		
	}

}
