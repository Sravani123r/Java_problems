package problemsJava;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 int a=scan.nextInt();
		 int b=scan.nextInt();
		 
		 System.out.println("before swapping : "+a+" ,"+b);
//		 logic 1   --- using third variable
//		 int t=a;
//		 a=b;
//		 b=t;
//		 
//		 logic 2 --- use + & - 
		 
//		 a=a+b;
//		 b=a-b;
//		 a=a-b;
		 
//		 logic 3 ----- use * & /  :- a & b =! 0
		 
		 a=a*b;
		 b=a/b;
		 a=a/b;
		 
		 System.out.println("After swapping : "+a+" ,"+b);

	}

}
