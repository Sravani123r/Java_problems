package ArraysDSA;

import java.util.Arrays;

public class BinarySearch {
	public static int Search(int ar[] ,int k) {
		int l=0,h=ar.length-1,mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(k==ar[mid]) {
				return mid;
			}else if(k < ar[mid]) {
				h=mid-1;
				l=l;
			}else {
				l=mid+1;
//				h=h;
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		int ar[]= {20,40,10,2,4,5,7,6,94};
		Arrays.sort(ar);
		int k=7;
		System.out.println(Search(ar,k));
	}

}
