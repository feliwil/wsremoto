package variaveis;

import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {
		//<tipo do dado> <nome da variavel/objeto;
		
		String nome= JOptionPane.showInputDialog("Digite seu nome:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"));
		System.out.println("Nome: " + nome);
		System.out.println("Nome: " + idade + " anos");
		System.out.println("Altura: " + altura + " metros" );
		System.out.println("Peso: " + peso + " kilos");
		
		double imc = peso / (altura * altura);
		
		System.out.printf("Imc: %.2f \n", imc);
		System.out.printf("%s seu imc �: %.2f \n", nome, imc);
		

	}//fecha metodo

}//fecha clase
