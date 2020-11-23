package br.com.exercicioheranca.beans;

import br.com.exercicioheranca.util.Modelo;

public class Empreiteiro extends Funcionario implements Modelo{
	private float valorEmpreita;

	
	
	public Empreiteiro() {
		super();
	}

	public Empreiteiro(String nome, int numeroRegistro, float valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}
	
	public void setAll(String nome, int numeroRegistro, float valorEmpreita) {
		super.setAll(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Valor da Empreitada: " + valorEmpreita;
	}

	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}

	@Override
	public float calcularSalario() {
		return valorEmpreita;
	}
	
	

}
