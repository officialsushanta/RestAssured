package Exam;

public class ReverseaString {
public static void main(String[] args) {

String str = "Lakshmi";
String rev = "";
int len = str.length();

	for(int i=len-1;i>=0; i--) {
	rev = rev+str.charAt(i);
	}
	System.out.println("the reverse string is"+ rev);



}
}
