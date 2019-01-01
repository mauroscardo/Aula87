package course;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a quantidade de valores: ");
		int n = sc.nextInt();
		int maior = Integer.MIN_VALUE;
		while(n<=0) {
			System.out.print("O número deve ser positivo: ");
			n = sc.nextInt();
		}
		for(int i=1; i<=n; i++) {
			System.out.printf("Digite o %dº valor: ", i);
			int v = sc.nextInt();
			if(v > maior) {
				maior = v;
			}
		}
		System.out.printf("Maior valor: %d%n", maior);
		sc.close();
	}

}
