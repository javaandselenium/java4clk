package methods;

public class Test5 {
static int a=100;
int b=200;

public static void demo() {
	System.out.println("demo");
}

public void sample() {
	System.out.println("sample");
}

	public static void main(String[] args) {
		Test5 t=new Test5();
		System.out.println(t.b);
		t.sample();
		
		System.out.println(Test5.a);
		Test5.demo();

	}

}
