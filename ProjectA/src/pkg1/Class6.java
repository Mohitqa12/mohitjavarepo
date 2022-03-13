package pkg1;

public class Class6 {
	
	public void parent ()
	{
		System.out.println("parent default constructor");
	}
	public void parent1 (int a)
	{
		System.out.println("parent 1 parameterized constructor");
	}
	public void parent2 (int a, int b)
	{
		System.out.println("parent 2 parameterized constructor");
	}
	public void parent3 (int a, int b, int c)
	{
		System.out.println("parent 3 parameterized constructor");
	}
	public void parent4 (int a, int b, int c, int d)
	{
		this.parent3(1, 2, 2);
		this.parent();
		this.parent1(1);
		this.parent2(1, 2);
		System.out.println("parent 4 parameterized constructor");
	}
	public static void main(String[] args) {


	}
}