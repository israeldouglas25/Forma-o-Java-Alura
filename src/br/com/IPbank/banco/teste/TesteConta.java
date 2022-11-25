package br.com.IPbank.banco.teste;

import br.com.IPbank.banco.modelo.ContaCorrente;
import br.com.IPbank.banco.modelo.ContaPoupanca;
import br.com.IPbank.banco.modelo.SacaException;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 220);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(123, 215);
		cp.deposita(200);
		
		try {
			cc.transfere(110, cp);
		} catch (SacaException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Saldo da conta Corrente: "+cc.getSaldo());
		System.out.println("Saldo da conta Poupanca: "+cp.getSaldo());

	}

}
