package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle r;
		r = new Rectangle();
		System.out.print("Digite o valor do lado maior: ");
		r.bMaior = sc.nextDouble();
		System.out.print("Digite o valor do lado menor: ");
		r.bMenor = sc.nextDouble();
		
		double area = r.area();
		System.out.println("Área: " + area);
		double perimetro = r.perimetro();
		System.out.println("Perímetro: " + perimetro);
		double diag = r.diagonal();
		System.out.printf("Diagonal: %.1f", diag);
		
		sc.close();

	}

}
