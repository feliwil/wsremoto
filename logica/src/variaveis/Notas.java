package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome:" );
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
		double media = (nota1 + nota2 ) / 2;
		double dif= 10 - media;
		System.out.printf ("Aluno(a) %s, sua m�dia obtida foi: %.2f para 10 faltaram: %.2f pontos", nome, media, (10-media));
		

	}

}
