package br.com.bankoffoz.beans;

import br.com.bankoffoz.util.PadraoConta;

public abstract class Conta implements PadraoConta{
	private short numero;
	private byte digito;
	private short agencia;
	private float saldo;
	private Cliente cliente;
	
	
	
	
	
	// construtor vazio
	public Conta() {
		super();
	}
	
	//construtor cheio
	public Conta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	//metodo set all
	public void setAll (short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public String getAll () {
		return 
				"Conta: " + numero +"-"+digito +"\n"+
				"Agencia: " + agencia +"\n" +
				"Saldo: " + saldo +"\n" +
				cliente.getAll();
	
	}
	//metodos 
	public short getNumero() {
		return numero;
	}
	public void setNumero(short numero) {
		this.numero = numero;
	}
	public byte getDigito() {
		return digito;
	}
	public void setDigito(byte digito) {
		this.digito = digito;
	}
	public short getAgencia() {
		return agencia;
	}
	public void setAgencia(short agencia) {
		this.agencia = agencia;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public float verificarSaldo (float limite) {
		if (this instanceof Poupanca) {
		return saldo;
		}else if (this instanceof Corrente) {
			return saldo + limite;
		}else {
			return 0;
		}
	}
	
	@Override
	public boolean sacar(float param) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean depositar(float param) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
