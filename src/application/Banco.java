package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria cCorrente; 
		
		double saldo;
		System.out.print("Cliente: ");
		String cliente = sc.nextLine();
		System.out.print("Conta: ");
		String conta = sc.nextLine();
		System.out.print("Depósito? (S/N): ");
		char decisao = sc.next().charAt(0);
		if(decisao == 's' || decisao == 'S') {
			System.out.print("Digite o valor: ");
			double depositoInicial = sc.nextDouble();
			cCorrente = new ContaBancaria(cliente, conta, depositoInicial);
		}
		else {
			cCorrente = new ContaBancaria(cliente, conta);
		}
		System.out.println();
		System.out.println(cCorrente);
		
		System.out.println();
		System.out.print("Digite o valor do depósito: ");
		double valor = sc.nextDouble();
		ContaBancaria.deposito(valor);
		System.out.println("Dados atualizados: ");
		System.out.println(cCorrente);
		
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		valor = sc.nextDouble();
		ContaBancaria.saque(valor);
		System.out.println("Dados atualizados: ");
		System.out.println(cCorrente);
		
		sc.close();
	}

}

