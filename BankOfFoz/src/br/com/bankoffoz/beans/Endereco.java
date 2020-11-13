package br.com.bankoffoz.beans;

public class Endereco {
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	
	
	
	
	public Endereco() {
		super();
	}
	
	public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String uf,
			String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}
	
	
	public void setAll (String pLogradouro, String pNumero, String pComplemento, String pBairro, String pCidade, String pUf, String pCep ) {
			logradouro=pLogradouro;
			numero=pNumero;
			complemento=pComplemento;
			bairro=pBairro;
			cidade=pCidade;
			uf=pUf;
			cep=pCep;
		
	}
	
	public String getAll () {
		return
				"Logradouro: " + logradouro + "\n" +
				"Número: " + numero + "\n" +
				"Complemento: " + complemento + "\n" +
				"Bairro: " + bairro + "\n" +
				"Cidade: " + cidade + "\n" +
				"UF: " + uf + "\n" +
				"CEP: " + cep;
		
		
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String isComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
}
