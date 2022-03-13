package pkg1;

import java.util.Scanner;

public class Class5_1 {

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	public int div(int a, int b) {
		int c = a / b;
		return c;
	}

	public static void main(String[] args) {

		Class5_1 obj = new Class5_1();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the frist value");
		int x1 = sc.nextInt();
		System.out.println("enter the second value");
		int x2 = sc.nextInt();
		int mul1 = obj.mul(x1, x2);

		System.out.println("enter the thred value");
		int x3 = sc.nextInt();
		int sum1 = obj.sum(mul1, x3);

		System.out.println("enter the forth value");
		int x4 = sc.nextInt();
		int sum2 = obj.sum(sum1, x4);

		System.out.println("enter the fifth value");
		int x5 = sc.nextInt();
		int sub1 = obj.sub(sum2, x5);

		System.out.println("enter the sixth value");
		int x6 = sc.nextInt();
		int div1 = obj.div(sub1, x6);

		System.out.println("final result" + div1);
	}

}
