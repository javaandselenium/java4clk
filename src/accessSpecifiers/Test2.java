package accessSpecifiers;

public class Test2 {
	private int a=10;
	
	private void add() {
		System.out.println("private method");
	}
	
	private Test2(){
	System.out.println("private constructor");	
	}

	public static void main(String[] args) {
		Test2 t=new Test2();
		System.out.println(t.a);
		t.add();
		
		Test4 t1=new Test4();
		System.out.println(t1.a);
		t1.add();

	}

}
