package br.com.IPbank.banco.teste;

import br.com.IPbank.banco.modelo.ContaCorrente;
import br.com.IPbank.banco.modelo.SacaException;

public class TesteSaca {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 220);
		cc.deposita(500);

		try {
			cc.saca(510);
		} catch (SacaException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(cc.getSaldo());

	}

}
