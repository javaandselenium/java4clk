package exceptionHandling;

import java.io.FileInputStream;

public class Test4 {
	
	public void demo() {
		try {
	FileInputStream f=new FileInputStream("./v");
		}
		catch(Exception e) {
			System.out.println("handled");
		}
	}

	public static void main(String[] args) {
		Test4 t=new Test4();
		t.demo();

	}

}
