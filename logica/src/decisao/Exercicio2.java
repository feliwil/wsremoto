package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		int result1 = 0;
		int result2= 0;
		int result3= 0;
		int num3= 0;
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2:"));

		if (num1!=num2) {
			if (num1>num2) {
				result1=num1;
				result2=num2;

			}else {
				result2=num1;
				result1=num2;
				num3 = Integer.parseInt(JOptionPane.showInputDialog("Numero 3:"));
			}
		}

		if (num3!=num2) {
			if (num3<num2) {
				result3 = num3;
							
		}else if (num3>num1 && num3>num2) {
			result1=num3;
			result2=num1;
			result3=num2;
					
			
		}
	}else {
		System.out.println("os numeros n�o podem ser iguais.");
	}
System.out.println("Os n�meros s�o: " + result1 + "," + result2+ "," + result3);


}//fecha metodo

}//fecha classe
