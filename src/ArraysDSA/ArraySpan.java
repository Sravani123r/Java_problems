package ArraysDSA;

import java.util.Scanner;

public class ArraySpan {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		int max=ar[0];
		int min=ar[0];
		for(int i=0;i<n;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		System.out.println(max-min);
	}

}
