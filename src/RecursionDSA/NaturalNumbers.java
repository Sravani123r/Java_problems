package RecursionDSA;

import java.util.Scanner;

public class NaturalNumbers {
	static void printNatural(int n) {
		if(n==0) {
			return;
		}
		printNatural(n-1);
		System.out.print(n+" ");
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printNatural(n);
	}
}
