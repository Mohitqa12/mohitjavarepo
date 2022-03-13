package pkg1;

public class Asn3_1 {

	public Asn3_1() {
		this(10, 11, 12);
		System.out.println("default constructor");
	}

	public Asn3_1(int a) {
		this(10, 12, 13, 14);
		System.out.println("one parametrized constructor");
	}

	public Asn3_1(int a, int b) {
		this(10);
		System.out.println("Two paramenterized constructor");
	}

	public Asn3_1(int a, int b, int c) {
		System.out.println("three parameterized constructor");
	}

	public Asn3_1(int a, int b, int c, int d) {
		this();
		System.out.println("four parameterized constructor");
	}

	public static void main(String[] args) {

		Asn3_1 E = new Asn3_1(10, 11);

	}

}
