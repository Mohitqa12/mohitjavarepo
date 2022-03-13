package pkg1;

public class Asn2 {

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public int sub(int a, int b) {
		int sub = a - b;
		return sub;
	}

	public int mul(int a, int b) {
		int mul = a * b;
		return mul;
	}

	public int div(int a, int b) {
		int div = a / b;
		return div;
	}

	/*
	
	(10*2)+2)+2)-2)/2)))))

	*/
	public static void main(String[] args) {

		Asn2 op = new Asn2();
		int multi = op.mul(10, 2);
		int sum1 = op.sum(multi, 2);
		int sum2 = op.sum(sum1, 2);
		int sub = op.sub(sum2, 2);
		int result = op.div(sub, 2);

		System.out.println(result);
	}

}
