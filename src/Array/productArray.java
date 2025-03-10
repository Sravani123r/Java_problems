package Array;
import java.util.Scanner;

public class productArray {

	public static void main(String[] args) {
		System.out.print("Enter size of array : ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter elements of array : ");		
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}     
		
		System.out.println(printProduct(ar));
	}
//	using method

	public static int printProduct(int[] ar) {
		int product=1;
		for(int i=0;i<ar.length;i++) {
			product *= ar[i];
	}
		return product;
		
//		using separate for loops
		
//		for(int i=0;i<n;i++) {
//			ar[i]=scan.nextInt();
//		}
//		int product=1;
//		for(int i=0;i<n;i++) {
//			product *=ar[i];
//		}
//		System.out.println(product);
//	}
	
	
//	using single for loop
		
//	int product=1;
//	for(int i=0;i<n;i++) {
//		ar[i]=scan.nextInt();
//		product *=ar[i];
//	}
//	System.out.println(product);		
//}
	}
}
