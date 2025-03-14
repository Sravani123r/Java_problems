package problemsJava;

import java.util.Scanner;

public class fabi_Recursion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = scan.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
    }
        public static int fibonacci(int n) {
            if (n <= 1) { 
                return n;
            }
            return fibonacci(n - 1) + fibonacci(n - 2); 
        

    }
}
