package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o num�ro 1:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 2:"));
		String operacao = JOptionPane.showInputDialog("Digite qual opera��o aritmetica deseja: (+, -, * ou /:)");

		if (!operacao.contentEquals("/") && num2!=0) {
			if (operacao.contentEquals("+")) {
				float resultado = (num1 + num2);
				System.out.println("O resultado da opera��o �: " + resultado);

			}else if (operacao.contentEquals("-")){
				float resultado = (num1 - num2);
				System.out.println("O resultado da opera��o �: " + resultado);		

			}else if (operacao.contentEquals("*")) {
				float resultado = (num1 * num2);
				System.out.println("O resultado da opera��o �" + resultado);
			}else {
				float resultado= (num1 / num2);
				System.out.println("O resultado da opera��o �: " + resultado);
			}

		}else {
			System.out.println("Impossivel realizar sua conta");
		}
	}

}