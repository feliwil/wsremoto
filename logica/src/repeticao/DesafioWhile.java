package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano entre 1900 e 2002:" ));
		while (ano<1900 || ano > 2002) {
			ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano entre 1900 e 2002 corretamente:" ));
		}
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s, entre 1 e 12" ));
		while (mes<1 || mes > 12) {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s, entre 1 e 12, corretamente" ));
		}
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:" ));

		if (mes== 1 || mes == 3 || mes==5 || mes ==7 || mes == 8 || mes==10|| mes ==12) {
			while (dia!=31) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia corretamente, o m�s " + mes + " posui 31 dias"  ));
			}
		}else if (mes==2) {
			while (dia!=28) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia corretamente, o m�s " + mes + " posui 28 dias"  ));
			}
		}else  {
			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia corretamente, o m�s " + mes + " posui 30 dias"  ));
		}

System.out.println (dia + "/"+ mes +"/"+ano);




	}

} // fecha metodo

