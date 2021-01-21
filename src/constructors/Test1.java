package constructors;

public class Test1 {
	
	Test1(int a,int b){
		System.out.println(a+b);
	}
	
	Test1(int a,double b){
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		Test1 t=new Test1(10,20);
		Test1 t=new Test1(20,10.0);

	}

}
