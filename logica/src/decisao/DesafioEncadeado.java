package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeado {

	public static void main(String[] args) {
		
		byte alf = Byte.parseByte(JOptionPane.showInputDialog("Caso seja alfabetizado digite 1 caso contr�rio 0"));
		if (alf==1) {
			String nome = JOptionPane.showInputDialog("Nome:").toUpperCase();
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
			if (idade <16) {
				System.out.println(nome + " infelizmente voc� ainda n�o pode votar");
			} else if (idade>= 16 && idade<18)  {
				System.out.println(nome + " S"
						+ "seu voto � facultativo. ");
			}else if (idade>70) {
				System.out.println(nome + " seu voto � facultativo. ");
			} else  {
				System.out.println(nome + " seu voto � obrigat�rio.");
			}
		} else {
			System.out.println("Infelizemnte voc� n�o pode votar.");
		}


	}
	
}
