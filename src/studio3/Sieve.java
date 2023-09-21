package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = in.nextInt();
		boolean[] A = new boolean[n];
		for (int i = 0; i < A.length; i++) {
			A[i] = true;
		}
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (A[i]) {
				for (int j = i * i; j < n; j += i) {
					A[j] = false;
				}
			}
		}
		for (int i = 2; i < A.length; i++) {
			if (A[i]) {
				System.out.print(i + ", ");
			}
			
		}

	}

}
