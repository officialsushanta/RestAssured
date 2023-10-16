package Exam;

public class SumOfTotalDIGITS {
public static void main(String[] args) {
System.out.println("Program to get sum of total digits from a digit");
	int num = 22111993;
	int sum = 0;
	while(num>0) {
		sum = sum+num%10;
		num = num/10;
	}
	System.out.println("the total sum is: " +sum);
	
	
}
}
