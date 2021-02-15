package exceptionHandling;

public class Test2 {
	
	public static void dedmo() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		try {
		int i=1/0;
		}
		catch(Exception e) {
			System.out.println("RTE");
		}
		finally{
		System.out.println("hello");
		Test2.dedmo();
		}
	}

}
