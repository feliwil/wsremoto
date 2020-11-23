package br.com.exercicioheranca.beans;

import br.com.exercicioheranca.util.Modelo;

public class Horista extends Funcionario implements Modelo{
	private float valorHora;
	private int numeroHoras;
	
	
	
	public Horista() {
		super();
	}
	
	public Horista(String nome, int numeroRegistro, float valorHora, int numeroHoras) {
		super(nome, numeroRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	
	public void setAll(String nome, int numeroRegistro, float valorHora, int numeroHoras) {
		super.setAll(nome, numeroRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	public String getAll () {
		return 
				super.getAll() + "\n" +
				"Valor da hora: " + "\n" +
				"Numero de Horas: " + numeroHoras;
	}
	
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public int getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	@Override
	public float calcularSalario() {
		
		return valorHora*numeroHoras;
	}
	
	
}
