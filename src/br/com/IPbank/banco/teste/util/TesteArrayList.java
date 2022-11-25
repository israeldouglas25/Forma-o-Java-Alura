package br.com.IPbank.banco.teste.util;

import java.util.ArrayList;

import br.com.IPbank.banco.modelo.Conta;
import br.com.IPbank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<>();
		
		Conta cc = new ContaCorrente(11, 200);
		lista.add(cc);
		
		Conta cc1 = new ContaCorrente(11, 14);	
		lista.add(cc1);
		
		System.out.println("Tamanho = " + lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho = " + lista.size());
		
		Conta cc2 = new ContaCorrente(33, 321);	
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(33, 314);	
		lista.add(cc3);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("--------------------");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
