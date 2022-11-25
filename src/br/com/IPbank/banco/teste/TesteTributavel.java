package br.com.IPbank.banco.teste;

import br.com.IPbank.banco.modelo.CalculadorDeImposto;
import br.com.IPbank.banco.modelo.ContaCorrente;
import br.com.IPbank.banco.modelo.SeguroDeVida;

public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 1220);
		cc.deposita(100.00);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}

}
