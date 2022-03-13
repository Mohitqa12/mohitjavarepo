package pkg1;

import java.util.Scanner;

public class Class5 {

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

		Class5 s = new Class5();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x1");
		int x1 = sc.nextInt();
		System.out.println("enter x2");
		int x2 = sc.nextInt();
		int add = s.sum(x1, x2);
		
		System.out.println("result" + add);

		System.out.println("enter x3");
		int x3 = sc.nextInt();
		int sub1 = s.sub(add, x3);
		System.out.println("result" + sub1);

		
		System.out.println("enter x4");
		int x4 = sc.nextInt();
		int sub2 = s.sub(sub1, x4);
		System.out.println("result" + sub2);

		
		System.out.println("enter x5");
		int x5 = sc.nextInt();
		int mul1 = s.mul(sub2, x5);
		System.out.println("result" + mul1);


		System.out.println("enter x6");
		int x6 = sc.nextInt();
		int div1 = s.div(mul1, x6);
		System.out.println("final value is " + div1);
	}

}
