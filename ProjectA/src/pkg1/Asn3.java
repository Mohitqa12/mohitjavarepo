package pkg1;

public class Asn3 {

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

		Asn3 obj = new Asn3();
		int div = obj.div(10, 2);
		int sub = obj.sub(div, 2);
		int add = obj.sum(sub, 2);
		int sub1 = obj.sub(add, 2);
		int mul = obj.mul(sub1, 2);

		System.out.println(mul);
	}

}
