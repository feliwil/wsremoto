package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
	
	
	byte tabuada =Byte.parseByte(JOptionPane.showInputDialog("Digite um número:"));
		for (int cont=0;cont<11;cont++) {
			System.out.println(tabuada + "x" + cont + "=" + (tabuada *cont));
		}

	} //fecha metodo

}//fecha classe
