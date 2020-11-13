package br.com.bankoffoz.implementacao;

import br.com.bankoffoz.beans.Cliente;
import br.com.bankoffoz.beans.Conta;
import br.com.bankoffoz.beans.Corrente;
import br.com.bankoffoz.beans.Endereco;
import br.com.bankoffoz.beans.Poupanca;
import br.com.bankoffoz.util.Magica;

public class ImplementarConta {

	public static void main(String[] args) {
		Conta objeto = null;
		
		
		char opcao = Magica.s("Digite <C - Conta Corrente> ou <P - Poupança>").charAt(0);
		while (opcao!='C'&& opcao!='P') {
			opcao = Magica.s("Digite <C - Conta Corrente> ou <P - Poupança>").charAt(0);
		}
			if (opcao=='C') {
				objeto = new Corrente (
						Magica.sh("Numero"),
						Magica.by("Digito"),
						Magica.sh("Agencia"),
						Magica.f("Saldo"),
						new Cliente (
								Magica.i("ID"),
								Magica.s("Nome"),
								Magica.s("CPF"),
								new Endereco ()
									//	Magica.s("Logradouro"),
									//	Magica.s("Numero"),
									//	Magica.s("Complemento"),
									//	Magica.s("Bairro"),
									//	Magica.s("Cidade"),
									//	Magica.s("UF"),
									//	Magica.s("CEP")								
									//	)	
								),
						Magica.f("limite"),
						Magica.f("Taxa")
						
			
						);
						System.out.println(objeto.getAll());
			} else {
				objeto = new Poupanca (
						Magica.sh("Número"),
						Magica.by("Digito:"),
						Magica.sh("Agência"),
						Magica.f("Saldo:"),
						new Cliente (
								Magica.i("ID"),
								Magica.s("Nome"),
								Magica.s("CPF"),
								new Endereco ()
								//	Magica.s("Logradouro"),
								//	Magica.s("Numero"),
								//	Magica.s("Complemento"),
								//	Magica.s("Bairro"),
								//	Magica.s("Cidade"),
								//	Magica.s("UF"),
								//	Magica.s("CEP")								
								//	)	
							),
						Magica.sh("Rendimento")
						);
				System.out.println(objeto.getAll());
			}
	System.out.println(objeto.depositar(1000));
	System.out.println(objeto.getSaldo());
	System.out.println(objeto.sacar(50));
	System.out.println(objeto.getAll());
	
	}
	

}
