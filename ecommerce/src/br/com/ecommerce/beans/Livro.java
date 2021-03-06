package br.com.ecommerce.beans;

import br.com.ecommerce.util.PadraoProduto;

public class Livro extends Produto implements PadraoProduto{
	private String isbn;
	private String autor;
	private String editora;
	
	
	public String getAll () {
		return 
				super.getAll() + "\n" +
				"ISBN: " + isbn + "\n" +  
				"Autor: " + autor + "\n" +
				"Editora: " + editora;  
	}
	
	
	public void setAll (String descricao, float valorVenda, float valorCompra, int id, int qtde, String isbn, String autor,
			String editora) {
		super.setAll(descricao, valorVenda, valorCompra, id, qtde);
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
	}
	
	
	public Livro() {
		super();
	}
	public Livro(String descricao, float valorVenda, float valorCompra, int id, int qtde, String isbn, String autor,
			String editora) {
		super(descricao, valorVenda, valorCompra, id, qtde);
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}


	@Override
	public float retornarImposto() {
		
		return getValorCompra()*(float)0.5;
	}


	@Override
	public float obterValorPromocao(float param) {
		// TODO Auto-generated method stub
		return getValorVenda()-getValorVenda()*(param/100);
	}
	
	
}
