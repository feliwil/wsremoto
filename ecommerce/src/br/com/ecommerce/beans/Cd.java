package br.com.ecommerce.beans;

import br.com.ecommerce.util.PadraoProduto;

public class Cd extends Produto implements PadraoProduto{
	private String artista;
	private int totalFaixas;
	private boolean lancamento;
	
	
	
	
	
	//construtor vazio
	public Cd() {
		super();
	}
	
	//construtor cheio
	public Cd(String descricao, float valorVenda, float valorCompra, int id, int qtde, String artista, int totalFaixas,
			boolean financiamento) {
		super(descricao, valorVenda, valorCompra, id, qtde);
		this.artista = artista;
		this.totalFaixas = totalFaixas;
		this.lancamento = financiamento;
	}
	
	//metodo obter informações gerais
	public String getAll () {
		return
				super.getAll() + "\n" +
				"Artista: " + artista + "\n" +
				"Total de Faixas: " + totalFaixas + "\n" +
				"Lançamento: " + lancamento;
	}
	
	//metodo salvar informações gerais
	public void setAll(String descricao, float valorVenda, float valorCompra, int id, int qtde, String artista, int totalFaixas,
			boolean financiamento) {
		super.setAll(descricao, valorVenda, valorCompra, id, qtde);
		this.artista = artista;
		this.totalFaixas = totalFaixas;
		this.lancamento = financiamento;
	}


	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getTotalFaixas() {
		return totalFaixas;
	}
	public void setTotalFaixas(int totalFaixas) {
		this.totalFaixas = totalFaixas;
	}
	public boolean isFinanciamento() {
		return lancamento;
	}
	public void setFinanciamento(boolean financiamento) {
		this.lancamento = financiamento;
	}

	@Override
	public float retornarImposto() {
		return getValorVenda()*(float) 0.07;
	}

	@Override
	public float obterValorPromocao(float param) {
		return getValorVenda()-getValorVenda() *(param/90);
	}
	
	
}
