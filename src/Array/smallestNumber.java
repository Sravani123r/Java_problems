package Array;

import java.util.Scanner;

public class smallestNumber {

	public static void main(String[] args) {
		System.out.print("Enter Size of array : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar[] = new int[n];
		System.out.println("enter array elements : ");
		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
		}
		int smallest = ar[0];

		for (int i = 0; i < n; i++) {
			if (ar[i] < smallest) { // if there is smallest number in an array it will change the vcalue of smallest
				smallest = ar[i]; // If yes, updates smallest other wise no change
			}
		}
		System.out.print("Smallest number in an array is : " + smallest);
	}

}
