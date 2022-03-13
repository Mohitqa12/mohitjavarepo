package LoopsPrac;

import java.util.Scanner;

public class SwapUserInput {

	public static void main(String[] args) {

		int a, b, c;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter value a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("before swapping no  " + a + " " + b);

		c = a;
		a = b;
		b = c;
		System.out.println("After swapping no  " + a + " " + b);
		//System.out.println();

	}

}
