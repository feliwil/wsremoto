package br.com.exercicioheranca.beans;

import br.com.exercicioheranca.util.Modelo;

public class Comissionado extends Funcionario implements Modelo {
	private float salarioBase;
	private float comissao;
	
	
	
	
	
	public Comissionado() {
		super();
	}


	public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	public void setAll(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super.setAll(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	public String getAll () {
		return 
				super.getAll() + "\n" +
				"Salário Base: " + "\n" +
				"Comissão: " + comissao;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}


	@Override
	public float calcularSalario() {
		return salarioBase + (salarioBase*comissao/100);
	}

}
