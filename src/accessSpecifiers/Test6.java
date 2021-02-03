package accessSpecifiers;

public class Test6 {
	 int a=100;
	 
	 void add() {
		 System.out.println("default method");
	 }
	 
	 Test6(){
		 System.out.println("default constructor");
	 }
	
	

	public static void main(String[] args) {
		Test6 t6=new Test6();
		System.out.println(t6.a);
		t6.add();
		
		

	}

}
