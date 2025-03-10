package Array;

import java.util.Scanner;

public class absouluteSum {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("enter array size : ");
		int n=scan.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter elements of array : ");
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();		
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum += Math.abs(ar[i]);
		}
		System.out.print("Absolute sum of array is " + sum);
	}

}

