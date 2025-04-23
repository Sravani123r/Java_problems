package Array;

import java.util.Scanner;

public class Reverse_an_array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = scan.nextInt(); // size of an array
		int[] arr = new int[n]; // array elements
		System.out.println("enter " + n + "elements :");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();

		}
		System.out.println("Reversed array : ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}
}
