package task.codejava;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int b = sc.nextInt();
		
		// handle the exception
		try {
		double c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	
		sc.close();

	}

}
