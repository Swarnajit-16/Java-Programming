package PracticeSet;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int first = 0, sec = 1, n;

		System.out.println("enter a range:");
		n = input.nextInt();
		System.out.print(first + " " + sec);
		for (int i = 2; i <= n; i++) { // N er age obdhi bolle < and n obdhi
										// bolle = use korte hbe.

			int fibo = first + sec;
			System.out.print(" " + fibo);
			first = sec;
			sec = fibo;
		}
		// System.out.println( );
	}

}
