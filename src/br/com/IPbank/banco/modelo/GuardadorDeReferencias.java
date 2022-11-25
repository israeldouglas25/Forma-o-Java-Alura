package br.com.IPbank.banco.modelo;

public class GuardadorDeReferencias {
	
	private Object[] referencias;
	private int posisao;

	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posisao = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posisao] = ref;
		this.posisao++;
	}
	
	public int getQtdElementos() {
		return this.posisao;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}

}
