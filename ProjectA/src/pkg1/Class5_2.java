package pkg1;

public class Class5_2 {

	public Class5_2() {
		this(2, 2, 2);
		System.out.println("parent default constructor");
	}

	public Class5_2(int a) {
		this();
		System.out.println("parent 1 parameterized constructor");
	}

	public Class5_2(int a, int b) {
		this(2);
		System.out.println("parent 2 parameterized constructor");
	}

	public Class5_2(int a, int b, int c) {
		System.out.println("parent 3 parameterized constructor");
	}

	public static void main(String[] args) {

	}

}
