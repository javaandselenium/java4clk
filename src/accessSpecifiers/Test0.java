package accessSpecifiers;

public class Test0 {
	public int a=10;
	public  void demo()
	{
		System.out.println("public method");
	}
	
	public Test0() {
		System.out.println("public constructor");
	}

	public static void main(String[] args) {
	Test0 t=new Test0();
	System.out.println(t.a);
t.demo();

Test4 t1=new Test4();
System.out.println(t1.a);
t1.add();

	}

}
