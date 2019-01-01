package course;

import java.util.Scanner;

public class Cap69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade depessoas: ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		for(int i=0; i<n; i++) {
			System.out.print("Informe a altura: ");
			vet[i] = sc.nextDouble();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(vet[i]);
		}
		 double acum = 0;
		for(int i=0; i<n; i++) {
			acum += vet[i];
			System.out.println(acum);
		}
		sc.close();

	}

}
