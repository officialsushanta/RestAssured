package Regular;

import java.util.Scanner;

public class FibonacciNumber {
public static void main(String[] args) {
	//Fibonacci Number
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number:");
	int num1 = sc.nextInt();
	System.out.println("Enter second number:");
	int num2 = sc.nextInt();
	System.out.println("Enter number of iterations:");
	int limit = sc.nextInt();
	int result = 0;
	for(int i=0; i<=limit; i++) {
		result = num1 + num2;
		num1 = num2;
		num2 = result;
		System.out.println(result);
	}
	
	
	
	
}
}
