package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Aumento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Salario> list = new ArrayList<>();
		System.out.print("Quantidade de funcionários: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.print("ID do funcionário " + i + ": ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			list.add(new Salario(id, nome, salario));
		}
		System.out.println(list);
		System.out.print("ID de funcionário para reajuste: ");
		int id = sc.nextInt();
		Salario empregado = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(empregado == null) {
			System.out.println("ID inexistente");
			System.out.println(list);
		} 
		else {
			System.out.println("Percentual do reajuste: ");
			double percent = sc.nextDouble();
			empregado.reajuste(percent);
		}
		System.out.println();
		System.out.println("Lista atualizada:");
		
		for(Salario atual : list) {
			System.out.println(atual);
		}
		
		 		
		sc.close();
	}

}
