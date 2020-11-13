package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Cd;
import br.com.ecommerce.beans.Livro;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.util.Magica;

public class ImplementarProduto {

	public static void main(String[] args) {
		Produto objeto = null;
		
		do {
			char opcao = Magica.s("Digite <L> ou <C>").charAt(0);
			if (opcao=='L') {
				objeto = new Livro (
						Magica.s("Descrição: "),
						Magica.f("Valor Venda:"),
						Magica.f("Valor Compra:" ),
						Magica.i("Codigo:" ),
						Magica.i("Qtde:"),
						Magica.s("ISBN"),
						Magica.s("Autor:"),
						Magica.s("Editora:")
						);
			} else {
				objeto = new Cd (
						Magica.s("Descrição: "),
						Magica.f("Valor Venda:"),
						Magica.f("Valor Compra:" ),
						Magica.i("Codigo:" ),
						Magica.i("Qtde:"),
						Magica.s("Artista:"),
						Magica.i("Total de Faixas"),
						Magica.b ("É lançamento?")
						);
			}

			JOptionPane.showMessageDialog (null,objeto.getAll());
			JOptionPane.showMessageDialog(null, objeto.retornarImposto());
			
		}while (JOptionPane.showConfirmDialog(
				null, 
				"Deseja continuar?",
				"Pergunta",
				JOptionPane.YES_NO_OPTION
				) ==0 
				);
	}
}
