package constructors;

public class Test4 {

	Test4(int a) {
		System.out.println(a);
	}

	Test4(double b, int a) {
		this(10);
		System.out.println(b + a);
	}

	Test4(String b) {
		this(20.90, 30);
		System.out.println(b);
	}

	Test4(String a, int b) {
		this("Hello java");
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Test4 t = new Test4("selenium", 100);
	}

}
