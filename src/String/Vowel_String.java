package String;

import java.util.Scanner;

public class Vowel_String {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=scan.nextLine();
		
		if(s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o")|| s.contains("u")) {
			System.out.println("The string contains a vowel.");
		}else {
			System.out.println("The string does not contain any vowels.");
		}
	}
}