package br.com.IPbank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29;
		
		Integer idadeRef = Integer.valueOf(idade); //autoboxing
		int valor = idadeRef.intValue(); //unboxing
		System.out.println(idadeRef);
		
		String s = "10";
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef);
		System.out.println(numeros);
		
		Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);
        
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
	}

}
