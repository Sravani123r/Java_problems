package Array;

import java.util.Scanner;

public class arraysEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
//		else {
//			System.out.println("There is no Even numbers");
//		}
		}
	}
}