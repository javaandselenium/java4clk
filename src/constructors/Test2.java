package constructors;

public class Test2 {

	Test2(int a) {
		System.out.println(a);
	}

	Test2(int a, double b) {
		System.out.println(a + b);
	}

	Test2(double a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Test2 t = new Test2(20.00, 10);
		Test2 t1 = new Test2(10);

	}

}
