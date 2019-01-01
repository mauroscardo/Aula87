package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class CalcSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		System.out.print("Nome do funcion�rio: ");
		func.nome = sc.nextLine();
		System.out.print("Informe o sal�rio bruto: ");
		func.salBruto = sc.nextDouble();
		System.out.print("Informe o valor do imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.print("Percentual de aumento: ");
		double percent = sc.nextDouble();
		func.salAumentado(percent);
		
		System.out.printf("%nNome: " + func.nome +"%nSal�rio bruto: " + func.salBruto + "%nDesconto: " + func.imposto + "%nSal�rio l�quido: " + func.salLiq());
		
		System.out.println();
		System.out.println("***************************");
		System.out.println(func);
		
		sc.close();

	}
}
