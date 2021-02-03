package accessSpecifiers;

public class Test4 {
	protected int a=10;
	
	protected void add() {
		System.out.println("protected method");
	}
	
	protected Test4(){
		System.out.println("protected constructor");
	}

	public static void main(String[] args) {
		Test4 t1=new Test4();
		System.out.println(t1.a);
		t1.add();
		
		Test6 t6=new Test6();
		System.out.println(t6.a);
		t6.add();
		
	}

}
