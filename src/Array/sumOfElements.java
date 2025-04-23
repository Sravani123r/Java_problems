package Array;

import java.util.Scanner;

public class sumOfElements {

	public static void main(String[] args) {
		System.out.print("Enter Size of array : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar[] = new int[n];
		System.out.println("enter elements: ");
		int sum = 0;
		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
			sum += ar[i];
		}
		System.out.println(sum);
	}

}
