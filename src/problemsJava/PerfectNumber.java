package problemsJava;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
        int num = scan.nextInt();
        
        if (isPerfectNumber(num)) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }
    }

    private static boolean isPerfectNumber(int num) {
        if (num < 2) return false;  
        
        int sum = 1; 
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) { 
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}