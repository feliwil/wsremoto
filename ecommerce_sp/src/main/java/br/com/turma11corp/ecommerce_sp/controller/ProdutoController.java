package br.com.turma11corp.ecommerce_sp.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.turma11corp.ecommerce_sp.model.Produto;

@RestController
public class ProdutoController {

	@GetMapping ("/produto")
	public Produto exibirProduto() {
		Produto prod;
		prod = new Produto();
		prod.setId(10);
		prod.setNome("Teste");
		prod.setDetalhes("Teste de implementação");
		prod.setPreco(2000);
		prod.setQtdEstoque(10);
		return prod;
		
	}

	@GetMapping ("/produtos/todos")
	public ArrayList <Produto> getProdutos() {
		ArrayList<Produto> lista;
		lista = new ArrayList <Produto> ();
		lista.add(new Produto());
		for (int i =1 ; i<=10; i++) {
			Produto p = new Produto();
			p.setId(i);
			p.setNome("Produto " + i);
			p.setDetalhes("Detalhes " + i);
			p.setPreco(100 +100);
			p.setQtdEstoque(10+i);
			lista.add(p);
		}
		return lista;
				
	}
	
	@PostMapping ("/produto/novo")
	public String adicionarNovoProduto (@RequestBody Produto novo) {
		System.out.println("------ DEBUG------");
		System.out.println("Produto Recebido " + novo.getId() + "/" + novo.getNome() +"/"  + novo.getDetalhes() + novo.getPreco() + "/" + novo.getQtdEstoque());
		System.out.println("------ FIM DEBUG------");
		return "Sucesso";
	}
	
}
