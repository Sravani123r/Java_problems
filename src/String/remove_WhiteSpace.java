package String;

import java.util.Scanner;

public class remove_WhiteSpace {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String result = str.replaceAll("\\s+", "");

	        System.out.println("Without spaces: " + result);
	    }
	}
