package course;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int n1 = sc.nextInt();
		//int n2 = sc.nextInt();
		//int n3 = sc.nextInt();
		
		//if (n1 > n2 && n1 > n3) {
			//System.out.println(n1);
			//if (n2 > n1 && n2 > n3) {
				//System.out.println(n2);
			//}
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && a > c) {
		System.out.println("Higher = " + a);
		}
		else if (b > c) {
		System.out.println("Higher = " + b);
		}
		else {
		System.out.println("Higher = " + c);
		}
		}
		
	}

//}
