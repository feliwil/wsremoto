package br.com.bankoffoz.beans;

import br.com.bankoffoz.util.PadraoConta;

public class Corrente extends Conta implements PadraoConta{
	private float limite;
	private float taxa;

	
	//Construtor vazio
	public Corrente() {
		super();
	}
	//contrutor cheio
	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	
	public String getAll () {
		return 
				super.getAll() + "\n"+
				"Limite" + limite + "\n" +
				"Taxa" + taxa;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	
	
	public void debitarTaxa () {
		super.setSaldo(super.getSaldo()-taxa);
	}
	
	public void aumentarLimite (float param) {
		limite=limite + limite* (param/100);
	}
	@Override
	public boolean sacar(float param) {
		if (super.getSaldo()- param > limite ) {
			super.setSaldo(super.getSaldo() - param);
			return true;
		}else {
			return false;
	}
		}
	@Override
	public boolean depositar(float param) {
		super.setSaldo(super.getSaldo()+param);
		return true;
	}
	
}
