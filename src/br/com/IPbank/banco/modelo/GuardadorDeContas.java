package br.com.IPbank.banco.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int posisao;

	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posisao = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posisao] = ref;
		this.posisao++;
	}
	
	public int getQtdElementos() {
		return this.posisao;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}

}
