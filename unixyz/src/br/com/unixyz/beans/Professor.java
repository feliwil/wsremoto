package br.com.unixyz.beans;

public class Professor {
	private int id;
	private String nome;
	private String titulacao;
	private String fone;
	private Endereco endereco;
	
	
	
	
	public Professor() {
		super();
	}
	
	
	public Professor(int id, String nome, String titulacao, String fone, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.titulacao = titulacao;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	public void setAll (int pId, String pNome, String pTitulacao, String pfone, Endereco pEndereco) {
		id=pId;
		nome=pNome;
		titulacao=pTitulacao;
		fone = pfone;
		endereco =pEndereco;
	}
	
	public String getAll () {
		return 
				"ID: " + id +"\n" +
				"Nome: " + nome +"\n" +
				"Titula��o: " + titulacao +"\n" +
				"Fone: " + fone +"\n" +
				"Endere�o: " + endereco.getAll();
	}
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
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
