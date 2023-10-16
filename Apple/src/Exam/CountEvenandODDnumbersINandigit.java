package Exam;

public class CountEvenandODDnumbersINandigit {
public static void main(String[] args) {
	int num = 1298735546;
	int odd_count = 0;
	int even_count = 0;
	while(num>0) {
		int res = num%10;
		if(num%2==0) {
			even_count++;
		}
		else {
			odd_count++;
		}
		num = num/10;
	}
	System.out.println(even_count);
	System.out.println(odd_count);
	
	
	
}
}
