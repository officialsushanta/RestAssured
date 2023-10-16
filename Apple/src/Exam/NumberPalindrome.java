package Exam;

import java.util.Scanner;

public class NumberPalindrome {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number:");
	int num = sc.nextInt();
	int orig_num = num;
	int rev = 0;

	while(num!=0){
	rev = rev*10 + num%10;
	num = num/10;
	}
	if(orig_num==rev)
		{
		System.out.println(orig_num+" Its an palindrome number");
		}
	else{
	System.out.println(orig_num+" It's not na plaindrome number");
	}

	
	
	
}
}
