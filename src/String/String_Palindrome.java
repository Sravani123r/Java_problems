package String;

import java.util.Scanner;


public class String_Palindrome {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = scan.nextLine();
        
        String reversed = ""; 
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        
        if (s.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }
}
