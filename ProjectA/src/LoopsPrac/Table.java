package LoopsPrac;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter any no.");

		int no = sc.nextInt();

		for (int j = 1; j <= 10; j++) {
			System.out.println(no + "*" + j + "=" + j * no);
		}
	}

}
