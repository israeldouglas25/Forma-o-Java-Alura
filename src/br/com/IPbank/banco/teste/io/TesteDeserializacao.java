package br.com.IPbank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.IPbank.banco.modelo.Cliente;
import br.com.IPbank.banco.modelo.ContaCorrente;

public class TesteDeserializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();
		
		System.out.println(cc.getSaldo());
		System.out.println(cc.getTitular().getNome());

	}

}
