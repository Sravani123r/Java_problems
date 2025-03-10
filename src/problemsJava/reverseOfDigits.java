package problemsJava;

import java.util.Scanner;

public class reverseOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n=scan.nextInt();
		
		System.out.println("The digits of the given number: ");
		while(n>0) {
			System.out.print(n % 10 +" ");
			n /=10;
		}
		
	}

}
