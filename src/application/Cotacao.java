package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Cotacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o câmbio do dia (dolar): ");
		double cambio = sc.nextDouble();
		System.out.print("Quantidade de dólares a comprar: ");
		double qtDolar = sc.nextDouble();
		double valorTotal = CurrencyConverter.convert(qtDolar, cambio);
		System.out.println("Valor a pagar: R$ " + valorTotal);
		
		sc.close();
	}

}
