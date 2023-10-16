package Exam;

import java.util.HashSet;

public class DublicateArrays {
public static void main(String[] args) {
	
	String arr[] = {"Java", "C", "C++", "C#", "Java", "Python", "Ruby"};
	HashSet<String> language = new HashSet<String>();
	boolean flag = false;

	for(String b:arr){
		if(language.add(b)==false){
		System.out.println("Found Duplicate arr are: " +b);
		flag = true;
		}
		}
	if(flag==false){
	System.out.println("Oops: No such duplicate arr found");
	}
	
}
}
