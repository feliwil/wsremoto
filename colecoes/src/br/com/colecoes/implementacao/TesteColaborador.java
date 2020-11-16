package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.colecoes.beans.Colaborador;
import br.com.colecoes.util.Magica;

public class TesteColaborador {

	public static void main(String[] args) {
		
		Colaborador objeto = new Colaborador ();
		
		objeto.setNome(Magica.s("Digite seu nome: "));
		objeto.setCpf(Magica.s("Digite seu CPF: "));
		
		List <String> lista = new ArrayList<String>();
		do  {	
			lista.add(Magica.s("Digite o numero do telefone: "));
		}while (JOptionPane.showConfirmDialog
				(null, "Cadastrar novo telefone? ", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		
		objeto.setFone(lista);
		
		System.out.println(objeto.getAll());
		
		for (int contador=0;contador<lista.size();contador++) {
			System.out.println("Fone " + (contador+1) + ":" + lista.get(contador));
		}
		

	}

}
