package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test3 {
	
	public void demo() throws FileNotFoundException {
		FileInputStream f=new FileInputStream("./D");
		
	}

	public static void main(String[] args) {
	Test3 t=new Test3();
	try {
		t.demo();
	} catch (FileNotFoundException e) {
		System.out.println("handled");
	}
	System.out.println("deno");
	}

}
