package String;

import java.util.Scanner;

public class Reverse_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Adding characters in reverse order
        }

        System.out.println("Reversed String: " + reversed);
    }
}
