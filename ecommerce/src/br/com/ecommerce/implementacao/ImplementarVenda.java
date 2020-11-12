package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.util.Magica;

public class ImplementarVenda {

	
	public static void main(String[] args) {
		Venda venda = new Venda (
				Magica.f("Total: "),
				Magica.s ("Data:"),
				new Cliente (
						Magica.i("ID:"),
						Magica.s("Nome:"),
						Magica.s("CEP"),
						new Endereco()
						
						),
				new Produto(
						Magica.s ("Descrição:"),
						Magica.f ("Venda:"),
						Magica.f("Compra"),
						Magica.i ("ID:"),
						Magica.i ("Qtde:")				
						
						)
				
				);

System.out.println(venda.getAll());

	}

}