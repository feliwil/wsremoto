package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;
import br.com.colecoes.util.Magica;

public class TesteListObjeto {

	public static void main(String[] args) {
		//primeira forma
		List <Cargo> lista = new ArrayList<Cargo> ();
		lista.add(new Cargo (
					Magica.s("Cargo"),
					Magica.s("Nível"),
					Magica.f("Salário")	
				));
		
		
		//segunda forma
		Cargo objeto = new Cargo ();
		objeto.setNivel(Magica.s("Carg0"));
		objeto.setNome(Magica.s("Nivel"));
		objeto.setSalario(Magica.f("Salário"));
		lista.add(objeto);
		System.out.println("Nome do primeiro cargo:" +  lista.get(0).getNome());
		

		
		
		
		
		
		int contJr =0;
		float contSal=0;
		for (int cont=0;cont <lista.size();cont++) {
			System.out.println("Cargo numero: " +(cont+1) );
			System.out.println("NOme do cargo: " + lista.get(cont).getNome());
			System.out.println("nivel do cargo: " + lista.get(cont).getNivel());
			System.out.println("Salario do cargo: " + lista.get(cont).getSalario());
	
		
			if (lista.get(cont).getNivel().equals("JR")) {
				contJr++;
			}
			contSal=lista.get(cont).getSalario() +contSal;
			
		}
		System.out.println("Quantos cargos Juniors existe: " + contJr);
		System.out.println( "Media dos salarios cadastrados: " + (contSal/lista.size()));
		
		}
		
		
		
		
	}


