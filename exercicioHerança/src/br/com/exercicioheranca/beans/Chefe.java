package br.com.exercicioheranca.beans;

import br.com.exercicioheranca.util.Modelo;

public class Chefe extends Funcionario implements Modelo {
	private float salarioBase;
	private float adicionalTermo;
	private float beneficioTermo;
	
	
	
	

	public Chefe() {
		super();
	}
	
	
	public Chefe(String nome, int numeroRegistro, float salarioBase, float adicionalTermo, float beneficioTermo) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalTermo = adicionalTermo;
		this.beneficioTermo = beneficioTermo;
	}


	
	
	public void setAll(String nome, int numeroRegistro, float salarioBase, float adicionalTermo, float beneficioTermo)  {
		super.setAll(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalTermo = adicionalTermo;
		this.beneficioTermo = beneficioTermo;
	}
	
	public String getAll () {
		return
				super.getAll() + "\n" +
				"Salário Base: " + salarioBase +
				"Adicional Termo: " + adicionalTermo;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getAdicionalTermo() {
		return adicionalTermo;
	}
	public void setAdicionalTermo(float adicionalTermo) {
		this.adicionalTermo = adicionalTermo;
	}

	public float getBeneficioTermo() {
		return beneficioTermo;
	}

	public void setBeneficioTermo(float beneficioTermo) {
		this.beneficioTermo = beneficioTermo;
	}

	@Override
	public float calcularSalario() {
		
		return salarioBase + (salarioBase*adicionalTermo/100)+beneficioTermo ;
	}
	
	
	
	
	
	
	
}
