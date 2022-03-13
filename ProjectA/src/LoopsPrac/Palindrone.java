package LoopsPrac;

import java.util.Scanner;

public class Palindrone {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();
		//int no = 121;
		int temp = no;
		int rev = 0, rem;   
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (no == rev)
		{
			System.out.println(no + "palindrome");
		}
		else
		{
			System.out.println(no + "not palindrone");
		}
	}
}
