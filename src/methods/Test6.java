package methods;

public class Test6 {

	public void add(int a,int b) {
     System.out.println(a+b);
	}

	public void add(double a,double b) {
     System.out.println(a+b);
	}

	public void add(int a,int b,double c) {
     System.out.println(a+b+c);
	}

	public void add(double a,int b,int c,int d) {
     System.out.println(a+b+c+d);
	}
	
	public static void main(int a) {
		System.out.println(a);
	}

public static void main(String b,int a) {
		System.out.println(b+a);
	}


public static void main(int a,double b) {
	System.out.println(a+b);
}

	public static void main(String[] args) {
		Test6 t=new Test6();
		t.add(4,5);
		t.add(10,37,78.90);
		t.main(10,30.90);
		

	}

}
