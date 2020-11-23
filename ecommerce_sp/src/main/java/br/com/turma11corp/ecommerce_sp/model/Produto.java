package br.com.turma11corp.ecommerce_sp.model;

public class Produto {

		private int id;
		private String nome;
		private String detalhes;
		private double preco;
		private int qtdEstoque;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDetalhes() {
			return detalhes;
		}
		public void setDetalhes(String detalhes) {
			this.detalhes = detalhes;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public int getQtdEstoque() {
			return qtdEstoque;
		}
		public void setQtdEstoque(int qtdEstoque) {
			this.qtdEstoque = qtdEstoque;
		} 
		
		

		
}
