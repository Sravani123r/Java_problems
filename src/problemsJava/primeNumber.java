package problemsJava;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int n=scan.nextInt();
		
		if(isPrime(n)) {
			System.out.println(n+ " is a prime number");
			
		}else {
			System.out.println(n +" is not a prime number");
		}
	}

	
	public static boolean isPrime(int n) {
		if(n <=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

}