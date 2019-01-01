package application;

import java.util.Scanner;
import entities.Student;

public class MediaFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student estudante = new Student();
		System.out.print("Nome do aluno: ");
		estudante.nome = sc.nextLine();
		System.out.print("Nota 1: ");
		estudante.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		estudante.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		estudante.nota3 = sc.nextDouble();
		double notaFinal = estudante.notaFinal();
		double recup = estudante.recup();
		System.out.println(estudante);
		if(notaFinal < 60) {
			System.out.println("FAILED");
			System.out.printf("Faltando %.1f pontos", recup);
		}
		else {
			System.out.println("PASS");
		}
				
		sc.close();

	}

}
