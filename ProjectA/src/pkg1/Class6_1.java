package pkg1;

public class Class6_1 extends Class6 {

	public void child ()
	{
		
		System.out.println("child default constructor");
	}
	public void child1 (int a)
	{
		super.parent4(1, 2, 3, 4);
		this.child3(1, 2, 3);
		this.child2(1, 1);
		this.child();
		this.child4(1, 1, 1, 1);
		System.out.println("child 1 parameterized constructor");
	}
	public void child2 (int a, int b)
	{
		System.out.println("child 2 parameterized constructor");
	}
	public void child3 (int a, int b, int c)
	{
		System.out.println("child 3 parameterized constructor");
	}
	public void child4 (int a, int b, int c, int d)
	{
		System.out.println("child 4 parameterized constructor");
	}
	public static void main(String[] args) {
		Class6_1 cl = new Class6_1();
		cl.child1(12);
		
	}
}