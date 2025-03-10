package Array;
import java.util.Scanner;

public class oddIndex {

	public static void main(String[] args) {
		System.out.print("Enter size of array : ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter elements of array : ");
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
			
		}
		
		for(int i=1;i<n;i+=2) {
			System.out.print(ar[i]+" ");
		}
	}

}
