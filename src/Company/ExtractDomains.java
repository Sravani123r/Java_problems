package Company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ExtractDomains {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String url = sc.nextLine();
            url = url.replace("https://", "")
                     .replace("http://", "")
                     .replace("www.", "");
            String[] parts = url.split("\\.");
            set.add(parts[0]);
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);

        for (String domain : list) {
            System.out.println(domain);
        }
    }
}