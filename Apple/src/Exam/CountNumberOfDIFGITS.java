package Exam;

public class CountNumberOfDIFGITS {
public static void main(String[] args) {
	int num = 91837762;
	int count = 0;
	while(num>0) {
		num=num/10;
		count++;
	}
	System.out.println(count);
}
}
