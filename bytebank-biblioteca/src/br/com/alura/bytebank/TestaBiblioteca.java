package br.com.alura.bytebank;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TestaBiblioteca {

	public static void main(String[] args) {

		Conta c = new ContaCorrente(123,321);
		
		c.deposita(200.3);
		
		System.out.println("O saldo �: " + c.getSaldo());
	}

}
