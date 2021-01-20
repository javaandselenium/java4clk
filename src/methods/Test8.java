package methods;

public class Test8 {
	
	static {
		System.out.println("hello java");
	}
	public static void add() {
		System.out.println("adding");
	}
	
	static {
	    int a=10;
	    int b=20;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Test8.add();
	}

}
