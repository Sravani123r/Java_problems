package Company;

import java.util.Scanner;

public class NumberDetermination {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean isNumber = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') {
                isNumber = false;
                break;
            }
        }

        if (isNumber && s.length() > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
