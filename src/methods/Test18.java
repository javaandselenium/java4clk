package methods;

public class Test18 {
	
	public void demo() {
		System.out.println("Hello");
		
	}
	
	public static int demo1() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	
	public String sample() {
		String name="java";
		System.out.println(name);
		return name;
	}

	public static void main(String[] args) {
		Test18 t=new Test18();
		//System.out.println(t.demo());
		System.out.println(t.demo1());
		System.out.println(t.sample());
	}

}
