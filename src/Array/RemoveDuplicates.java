package Array;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			boolean isDuplicate=false;
			for(int j=0;j<i;j++) {
				if(ar[i]==ar[j]) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.print(ar[i]+" ");
			}
		}
	}

}
