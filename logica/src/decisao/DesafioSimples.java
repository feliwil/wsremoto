package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome:").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		
		if (idade <16) {
			System.out.println(nome + " infelizmente voc� ainda n�o pode votar");
		}
		
		if (idade>= 16 && idade<18)  {
			System.out.println(nome + " S"
					+ "seu voto � facultativo. ");
		}
		if (idade>70) {
			System.out.println(nome + " seu voto � facultativo. ");
		}
		if (idade>=18 && idade<=70) {
			System.out.println(nome + " seu voto � obrigat�rio.");
		}

	}

}
