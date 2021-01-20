package methods;

public class Test9 {
	
	{
		System.out.println("hello");
	}
	
	public void sub() {
		System.out.println(10-5);
	}
	
	static {
		System.out.println("java");
	}

	public static void main(String[] args) {
		Test9 t=new Test9();
		t.sub();

	}

}
