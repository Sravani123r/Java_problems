package String;

import java.util.Scanner;

public class Count_Vowel {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s=scan.nextLine().toLowerCase();
		
		int vowel=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e' || ch=='i' || ch=='o' || ch=='o' || ch=='u') {
				vowel++;
			}
		}
	}

}