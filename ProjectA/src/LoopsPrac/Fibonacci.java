package LoopsPrac;

public class Fibonacci {

	public static void main(String[] args) {

		int a = 0, b = 1;

		for (int i = 1; i <= 12; i++) {
			int c = a + b;
			System.out.print("" + c);
			System.out.print(" ");
			a = b;
			b = c;

		}

	}
}
