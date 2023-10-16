package Regular;

public class LinearSearch {
public static void main(String[] args) {
	int a[] = {13,34,65,36,76,64,89};
	int search_ele = 89;
	boolean flag = false;
	for(int i=0; i<=a.length; i++) {
		if(search_ele==a[i]) {
			System.out.println("Element found at index number: "+i);
		flag = true;
		break;
		}
	}
	if(flag==false) {
		System.out.println("No such element found.");
	}
}
}
