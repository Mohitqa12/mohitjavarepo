package pkg1;

public class Asn3_2 {

	public void m() {
		// this.m4();
		System.out.println("default method");
	}

	public void m1() {
		// this.m();
		System.out.println("one parameterized method");
	}

	public void m2() {
		// this.m1();
		System.out.println("two parameterized method");
	}

	public void m3() {
		System.out.println("three parameterized method");
	}

	public void m4() {
		this.m3();
		System.out.println("four parameterized method");
		this.m();
		this.m1();
		this.m2();
	}

	public static void main(String[] args) {
		Asn3_2 a = new Asn3_2();
		a.m4();
	}

}
