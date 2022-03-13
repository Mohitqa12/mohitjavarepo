package pkg1;

public class Class5_3 extends Class5_2 {

	public Class5_3() {
		this(2, 2);
		System.out.println("child default constructor");
	}

	public Class5_3(int a) {
		this(2, 2, 2);
		System.out.println("child 1 parameterized constructor");
	}

	public Class5_3(int a, int b) {
		super(2, 2);
		System.out.println("child 2 parameterized constructor");
	}

	public Class5_3(int a, int b, int c) {
		this();
		System.out.println("child 3 parameterized constructor");
	}

	public static void main(String[] args) {
		Class5_3 cl = new Class5_3(12);
	}

}
