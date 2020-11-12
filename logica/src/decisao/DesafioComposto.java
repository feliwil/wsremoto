package decisao;

import javax.swing.JOptionPane;

public class DesafioComposto {

	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Produto:");
		int estoque = Integer.parseInt((JOptionPane.showInputDialog("Estoque:")));
		if (estoque>=20 && estoque<= 40) {
			System.out.println("Estoque normal.");
		}else if (estoque>= 41 && estoque <=60) {
			System.out.println("Estoque alto.");
		}else if (estoque>60) {
			System.out.println("Estoque lotado.");
		}else {
			System.out.println("Estoque baixo.");
		}

	}

}
