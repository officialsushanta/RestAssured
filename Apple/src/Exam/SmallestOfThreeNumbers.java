package Exam;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int num1 = sc.nextInt();
	System.out.println("Enter second number: ");
	int num2 = sc.nextInt();
	System.out.println("Enter third number: ");
	int num3 = sc.nextInt();
	
	if(num1<num2 && num1<num3) {
		System.out.println(num1+ " is the smallest number among "+ num2+ " , " +num3);
	}
	else if(num2<num3 && num2<num1) {
		System.out.println(num2+" is the smallest number among "+ num1+ " , "+ num3);
	}
	else {
		System.out.println(num3+" is the smallest number among "+ num1 + " , "+ num2);
	}
}
}
