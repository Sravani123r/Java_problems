package Array;

import java.util.Scanner;

public class largestElement {

	public static void main(String[] args) {
		System.out.print("Enter size of array : ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter elements in an array : ");
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		
		int largest=ar[0];
		for(int i=1;i<n;i++) {
			if(ar[i]>largest) {
				largest=ar[i];
			}
		}
		System.out.println("largest number is "+ largest);
	}
}
