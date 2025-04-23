package ArraysDSA;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Size of array: ");
			int n=scan.nextInt();
			int ar[]=new int[n];
			System.out.print("Enter the elements: ");
			for(int i=0;i<n;i++) {
				ar[i]=scan.nextInt();
			}
			System.out.print("enter key value");
			int x=scan.nextInt();

			boolean found=false;
			for(int i=0;i<n;i++) {
				if(ar[i]==x) {
					System.out.println("presnt at index "+i);
					found=true;
					break;
				}
				
			}
			if(!found) {
				System.out.println("-1");
			}
			
		
	}
}
