package br.com.IPbank.banco.teste.util;

import java.util.ArrayList;

import br.com.IPbank.banco.modelo.Conta;
import br.com.IPbank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<>();

		Conta cc = new ContaCorrente(11, 200);
		lista.add(cc);

		Conta cc1 = new ContaCorrente(11, 14);
		lista.add(cc1);

		Conta cc3 = new ContaCorrente(11, 14);
		boolean existe = lista.contains(cc3);
		System.out.println("Já existe? " + existe);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
