package br.com.IPbank.banco.teste;

import br.com.IPbank.banco.modelo.Conta;
import br.com.IPbank.banco.modelo.ContaCorrente;
import br.com.IPbank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorReferencias {

	public static void main(String[] args) {

		GuardadorDeContas guardador	= new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(11, 200);	
		guardador.adiciona(cc);
		
		Conta cc1 = new ContaCorrente(11, 14);	
		guardador.adiciona(cc1);
		
		int tamanho = guardador.getQtdElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(1);
		System.out.println(ref.getNumero());

	}

	

}
