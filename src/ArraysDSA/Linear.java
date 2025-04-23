package ArraysDSA;

import java.util.Scanner;

public class Linear {
public static int LinearSearch(int[] ar, int key) {
	for(int i=0;i<ar.length;i++) {
		if(ar[i]==key) {
			return i;
		}
	}
	return -1;
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int ar[]= {20,10,39,45,56,53};
//	int key=45;
	int key=44;
	System.out.println(LinearSearch(ar, key));
	
}
}
