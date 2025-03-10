package Array;

import java.util.Scanner;

public class averageOfArray {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	            sum += arr[i];
	        }
	        double average = (double) sum / n;
	        System.out.println("Average = " + average);
	        
	}

}
