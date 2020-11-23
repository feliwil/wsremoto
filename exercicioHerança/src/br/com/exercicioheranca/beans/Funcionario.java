package br.com.exercicioheranca.beans;

import br.com.exercicioheranca.util.Modelo;

public class Funcionario implements Modelo {
	private String nome;
	private int numeroRegistro;
	
	
	//construtor vazio
	
	public Funcionario() {
		super();
	}
	
	//Construtor cheio
	
	public Funcionario(String nome, int numeroRegistro) {
		super();
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}
	
	public void setAll(String nome, int numeroRegistro) {
		
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}
	
	public String getAll() {
		return 
				"Nome: " + nome + "\n" +
				"Numero do Registro: " + numeroRegistro;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	@Override
	public float calcularSalario() {
		
		return 0;
	}
	
	
	
	
	
	
}
