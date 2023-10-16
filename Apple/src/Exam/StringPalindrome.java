package Exam;

import java.util.Scanner;

public class StringPalindrome {
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.next();
		String rev = "";
		int len = str.length();
		String orig_str = str;

		for(int i=len-1; i>=0; i--){
		rev = rev+str.charAt(i);
		}
		if(orig_str.equals(rev)){
		System.out.println(orig_str+" is an palindrome string");
		}
		else{
		System.out.println(orig_str+" is not an palindrome strineg");
		}
	
	
	
	
}
}
