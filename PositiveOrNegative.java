package problemsJava;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		if (n >=0) {
			System.out.println(n + " is positive number");
		}else {
			System.out.println(n + " is a negative number");
		}
	}

}
