package br.com.bankoffoz.beans;

import br.com.bankoffoz.util.PadraoConta;

public class Poupanca extends Conta implements PadraoConta {
	private float rendimento;



	//construtor cheio
	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}


	//construtor vazio
	public Poupanca() {
		super();
	}

	//metodos gerais
	public void setAll (short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public String getAll () {
		return 
				super.getAll() + "\n" +
				"Rendimento:" + rendimento;
	}

	//metodos
	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}


	public void creditarRendimentos () {
		super.setSaldo(super.getSaldo() + super.getSaldo()* (rendimento/100));
	}

	@Override

	public boolean sacar(float param) {
		if (super.getSaldo()- param>=0) {
			super.setSaldo(super.getSaldo() - param);
			return true;
		}else {
			return false;
		}
	}
	@Override
	public boolean depositar(float param) {
		if (param <=0) {
			return false;
		} else
		super.setSaldo(super.getSaldo()+param);
		return true;
		}
	}

