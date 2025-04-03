package problemsJava;

import java.util.Scanner;

public class factorial {

//	public static void main(String[] args) {
//		System.out.print("enter a number : ");
//		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
//		int result=factorial(n);
//		System.out.println("Factorial of "+ n +" is "+result);
//		
//	}
//
//	static int factorial(int n) {
//		if (n==1) {
//			return 1;
//		}
//		return n* factorial(n-1);
//	}
//}

//n!= 1x2x3x4x5 -------- x(n-1) x n;
//n! = n * (n-1)!


	public static void main(String[] args) {
		int factorial =1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number ");
		int number = scanner.nextInt();
		for (int i = 1; i <= number; i++){
		factorial = factorial * i;
		}
		System.out.println("Factorial number is :" +factorial);
		}
}