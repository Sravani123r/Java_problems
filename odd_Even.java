package problemsJava;

import java.util.Scanner;

public class odd_Even {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int x=scan.nextInt();
		if(x%2==0) {
			System.out.println( x+" is an Even Number.");
		}else {
			System.out.println(x +" is an Odd Number");
		}
	}

}
