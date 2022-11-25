package br.com.IPbank.banco.teste;

import br.com.IPbank.banco.modelo.Conta;
import br.com.IPbank.banco.modelo.ContaCorrente;
import br.com.IPbank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencia {

	public static void main(String[] args) {

		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(11, 22);
		contas[0] = cc1;
		
		ContaPoupanca cp2 = new ContaPoupanca(11, 37);
		contas[1] = cp2;
		
		ContaPoupanca ref = (ContaPoupanca) contas[1];
		System.out.println(cp2.getNumero());
		System.out.println(contas[0].getNumero());
		System.out.println(ref.getNumero());

	}

}
