package String;

import java.util.Scanner;

public class UpperCaseCharCount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String s=scanner.nextLine();

		int count=0;

		for(int i=0;i<s.length();i++){

			char ch=s.charAt(i);

			if (ch>=65 && ch<=90){

				count++;

			}

		}

		System.out.println(count);

	}
}