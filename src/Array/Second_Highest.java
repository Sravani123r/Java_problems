package Array;

import java.util.Scanner;

public class Second_Highest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = scan.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
		}

		int largest = ar[0];
		int SecondLargest = ar[0];

		for (int i = 1; i < n; i++) {
			if (ar[i] > largest) {
				SecondLargest = largest;
				largest = ar[i];
			} else if (ar[i] > SecondLargest && ar[i] != largest) {
				SecondLargest = ar[i];
			} else {
				System.out.println("None");
			}
		}
		System.out.println("the second largest element is : " + SecondLargest);

	}

}

//          0, 1,2,3, 4 ,5
//array= 10,20,4,45,99,60
//largest=ar[0]=10-> 20 
//SecondLargest=ar[0]=10 ->10
//
//loop
//20
//ar[i]=ar[1]=20>10 -> ar[2]=4>20
//SecondLargest=largest ==> 10=10 ->10 != 20 x -> second largest become 
//largest=ar[i] ==> largest=20
