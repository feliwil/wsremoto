package repeticao;

import javax.swing.JOptionPane;

public class DesafioDO {

	public static void main(String[] args) {
		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("JOGADOR 1: Digite o numero:"));
		int jogador2 =0;
		int tentativas= 0;
		
		do {
			jogador2 = Integer.parseInt(JOptionPane.showInputDialog("JOGADOR 2: Tente adivinhar o n�mero inserido pelo jogador 1:" ));
			
		tentativas=tentativas+1;	
				if (jogador1>jogador2){
					System.out.println("DICA: Tente um n�mero mais alto");
				}else if (jogador1<jogador2){
					System.out.println("DICA: Tente um n�mero mais baixo");
				}
		
			}while (jogador1 != jogador2);
			System.out.println("Parabens voc� acertou em " +tentativas + " tentativas. O n�mero digitado foi: " + jogador2);
		}

	}


