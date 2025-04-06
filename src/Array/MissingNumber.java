package Array;

public class MissingNumber {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,6};
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		System.out.println("Sum of the array :"+sum1);
		int sum2=0;
		for(int i=0;i<=6;i++) {
			sum2=sum2+i;
		}
		System.out.println("sum of range of elements in array : "+sum2);
		System.out.println("Missing Number is:"+(sum2-sum1));
	}


}
