package exceptionHandling;

public class Test0 {
	public static void main(String[] args) {
		int i=0;
	
		try {
		int a=1/0;
		}
		catch(ArithmeticException a1) {
		System.out.println("handled");
		}
		System.out.println("HELLO");
		System.out.println("hi");
	}

}
