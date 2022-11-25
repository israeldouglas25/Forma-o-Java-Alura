package br.com.IPbank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa o molde de uma conta.
 * 
 * @author Israel Douglas
 *
 */
public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	/**
	 * Construtor para inicializar o objeto conta da agencia e numero.
	 * 
	 * @param agencia
	 * @param numero
	 */

	public Conta(int agencia, int numero) {

		if (agencia < 1) {
			throw new IllegalArgumentException("Agencia inválida");
		}

		if (numero < 1) {
			throw new IllegalArgumentException("Numero da conta inválido");
		}

		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public abstract void deposita(double valor);

	/**
	 * O valor precisa ser maior ou igual que o saldo
	 * 
	 * @param valor
	 * @throws SacaException
	 */
	public void saca(double valor) throws SacaException {

		if (this.saldo < valor) {
			throw new SacaException("Valor invalido! Saldo: " + this.saldo + ", valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SacaException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode numero menor igual a zero!");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode agencia menor igual a zero!");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public boolean equals(Object ref) {

		Conta outra = (Conta) ref;

		if (this.agencia != outra.agencia) {
			return false;
		}

		if (this.numero != outra.numero) {
			return false;
		}

		return true;
	}

	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}

	@Override
	public String toString() {
		return "Agencia: " + this.agencia + ", Numero: " + this.numero + ", Saldo: " + this.saldo;
	}

}