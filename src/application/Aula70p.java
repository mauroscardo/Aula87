package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aula70e;

public class Aula70p {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o n�mero: ");
		int n = sc.nextInt();
		Aula70e[] vet = new Aula70e[n];
		
		for(int i=0; i<vet.length; i++) {
			sc.nextLine();
			System.out.print("Nome do produto: ");
			String nome = sc.nextLine();
			System.out.print("Pre�o do produto: ");
			double preco = sc.nextDouble();
			vet[i] = new Aula70e(nome, preco);
		}
		double acum = 0;
				for(int i=0; i<vet.length; i++) {
					acum += vet[i].getPreco();
				}
		System.out.println("M�dia = " + acum/n);
		
		sc.close();

	}

}
