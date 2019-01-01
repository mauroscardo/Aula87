package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Aluguel;

public class Alug {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("Quantidade de estudantes: ");
		int n = sc.nextInt();
		Aluguel[] vet = new Aluguel[10];
		
		for(int i=0; i<n; i++) {
			System.out.print("Número do quarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			vet[quarto] = new Aluguel(nome, email);
		}
		
		for(int i=0; i<vet.length; i++) {
			if(vet[i] != null){
				System.out.println(i + ": " + vet[i]);
			}
			System.out.println("******************************"); 
			for(Aluguel posicao : vet) {
			System.out.println(posicao);
		}System.out.println("******************************"); */
		
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("******************************");
		
		list.remove("Bob");
		list.add(0, "Laura"); 
		//list.removeIf(x -> x.charAt(0)=='A');
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("******************************");
		List<String> list2 = list.stream().filter(n -> n.charAt(0)=='A').collect(Collectors.toList());
		for(String n : list2) {
			System.out.println(n);
		}
		System.out.println("******************************");
		String ini = list.stream().filter(n -> n.charAt(0)=='A').findFirst().orElse(null);
		System.out.println(ini);
		sc.close();

	}
}
