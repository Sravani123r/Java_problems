package problemsJava;

import java.util.Scanner;

public class fabbinocci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int n=scan.nextInt();
		int first=0,second=1,next;
		System.out.println("Fibinacci series : "+ first +" "+second+" ");
		
		for(int i=2;i<n;i++) {
			next=first+second;
			System.out.println(next+" ");
			
			first=second;
			second=next;
		}
	}

}
