package problemsJava;

import java.util.Scanner;

public class palindrom {
	public static void main(String[] args) {
//		by comparing both
		 
//		String s="cooc";
//		String res="";
//		for(int i=3;i>=0;i--) {
//			res=res + s.charAt(i);
//		}
//		
//		if(res.equals(s)) {
//			System.out.println("yes its palindrome. :" +res);
//		}else {
//			System.out.println("no");
//		}
		
//		 by using length
//		String s="coocedfd";
//		String res="";
//		for(int i=s.length()-1;i>=0;i--) {
//			res=res + s.charAt(i);
//		}
//		
//		if(res.equals(s)) {
//			System.out.println("yes its palindrome. :" +res);
//		}else {
//			System.out.println("no");
//		}
		
//		by using boolean
		boolean isPalindrome=true;
		String s="sababas";
		int n=s.length();
		for(int i=0;i<n/2;i++) {
			System.out.println(i);
			if(s.charAt(i) != s.charAt(n-i-1)) {
				isPalindrome=false;
			}
		}
		if(isPalindrome) {
			System.out.println("Yes it`s Palindrome");
		}else {
			System.out.println("No it`s not a palindrome");
		}
//		System.out.print("Enter the number : ");
//		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
		
}
}



//A palindrome number is a number that remains the same when its
//digits are reversed
