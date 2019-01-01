package course;

import java.util.Scanner;

public class EntraDados2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		
		String s = sc.next();
		int digit = Integer.parseInt(s.substring(2));
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(digit);
		
		sc.close();

	}

}
