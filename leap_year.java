package problemsJava;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		System.out.print("Enter a year :: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if((n%4 == 0 && n% 100 != 0) || n% 400 ==0) {
			System.out.println(n + " is a leap year");
		}else {
			System.out.println(n+ " is not a leap year");
		}
	}

}


//If a year is divisible by 4, it might be a leap year.
//If it's a century year (divisible by 100), it must also be divisible by 400 to be a leap year.
//Otherwise, it's not a leap year.
