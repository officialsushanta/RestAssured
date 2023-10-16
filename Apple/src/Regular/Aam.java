package Regular;

import java.util.Scanner;

public class Aam {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Name to check its palindrome or not");
	String str = sc.next();
	String rev = "";
	int leng = str.length();
	String orig_str = str;

	for(int i=leng-1; i>=0; i--){
	rev = rev+str.charAt(i);
	}
	if(orig_str.equals(rev)){
	System.out.println("Its an palindrome");
	}
	else{
	System.out.println("Its not an palindrome");
	}
}
}
