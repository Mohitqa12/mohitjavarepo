package LoopsPrac;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int no = sc.nextInt();
		// int no = 9;
		int temp = 0;
		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println(no + " is prime");
		} else {
			System.out.println(no + "is not prime");
		}
	}
}