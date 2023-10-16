package Exam;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int num1 = sc.nextInt();
	System.out.println("Enter second number: ");
	int num2 = sc.nextInt();
	
	System.out.println("Number of iterations");
	int limit = sc.nextInt();
	int result = 0;
	System.out.println(num1);
	System.out.println(num2);
	for(int i=1; i<=limit; i++) {
		
		result = num1 + num2;
		num1 = num2;
		num2 = result;
		System.out.println(result);

	}
}
}
