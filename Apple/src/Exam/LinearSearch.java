package Exam;

public class LinearSearch {
public static void main(String[] args) {
	
	int a[] = {1,4,2,45,76,34,87,34};
	int search_ele = 45;
	boolean flag = false;
	for(int i=0;i<a.length; i++) {
		if(search_ele==a[i]) {
			System.out.println("Element found at index number: "+i);
			flag = true;
			break;
		}
	}
	if(flag==false) {
		System.out.println("Element not found.");
	}
	
	
}
}
