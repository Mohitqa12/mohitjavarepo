package LoopsPrac;

public class SwapMethod {

	public void mohit()
	{
		int a = 15, b = 25, c;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		SwapMethod md = new SwapMethod();
		
		md.mohit();
	}
}
