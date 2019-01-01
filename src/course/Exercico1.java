package course;

import java.util.Locale;

public class Exercico1 {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		double n1 = 20.0 / 3;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n%nRecord: %d years old, code %d and gender: %c%n%nMeasure with eight decimal places: %.8f%nRounded (three decimal places): %.3f%n", product2, price2, age, code, gender, measure, measure);
		System.out.printf("%.2f", n1);
		Locale.setDefault(Locale.US);
		System.out.printf("%nUS decimal point: %.3f%n", measure);
		int n2 = age++;
		System.out.println(age);
		System.out.println(n2);

	}

}
