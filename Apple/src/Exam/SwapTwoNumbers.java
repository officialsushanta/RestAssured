package Exam;

public class SwapTwoNumbers {
public static void main(String[] args) {
	
	int a = 10;
	int b = 20;
	System.out.println("Before swapping the value of a and b is: "+ a+ " , "+ b);
	/*
	 int t = a;
	 a = b;
	 b = t;
	 
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 
	 a=a*b;
	 b=a/b;
	 a=a/b;
	 */
	b=a+b-(a=b);
	System.out.println("After swapping the value of a and b is: "+ a+ " , "+ b);
}
}
