package methods;

public class Test4 {
	int a=10;
	
	static int b=100;
	
	public void add() {
		System.out.println(0+20);
	}
	
	public static void sub() {
		System.out.println(100-50);
	}

	public static void main(String[] args) {
		System.out.println(Test4.b);
		Test4.sub();
		
		Test4 t=new Test4();
		System.out.println(t.a);
		t.add();
		
	}

}
