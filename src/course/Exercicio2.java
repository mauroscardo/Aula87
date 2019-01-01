package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String nome = scan.nextLine();
		System.out.println("How many bedrooms are there in yor house?");
		int n1 = scan.nextInt();
		System.out.println("Enter product price:");
		double price = scan.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		String lastName = scan.next();
		int age = scan.nextInt();
		double altura = scan.nextDouble();
		
		System.out.println(nome);
		System.out.println(n1);
		System.out.println(price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(altura);
		
		scan.close();

	}
}
