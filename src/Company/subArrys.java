package Company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class subArrys {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		
		int count=0;
		
		for(int i=0;i<n;i++) {
			Set<Integer> set=new HashSet<>();
			for(int j=i;j<n;j++) {
				set.add(ar[j]);
			
			if(set.size()==k) {
				count++;
			}else if(set.size()>k) {
				break;
			}
		}
		}
        System.out.println(count);

	}
}
