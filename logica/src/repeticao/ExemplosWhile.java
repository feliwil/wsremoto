package repeticao;

import javax.swing.JOptionPane;

public class ExemplosWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Digite um email").toLowerCase();
		
		while (email.contains("@")==false) {
			email=JOptionPane.showInputDialog("Digite o email com @:").toLowerCase();
		}
		
		String nome = JOptionPane.showInputDialog("Digite um email").toLowerCase();
		
		while (nome.length()<=5 || nome.length()>10) {
			nome=JOptionPane.showInputDialog("O nome deve conter em 5 e 10 caracteres:").toLowerCase();
		}
		System.out.println("nome: " + nome);
		System.out.println(("email: " + email));

	}

}
