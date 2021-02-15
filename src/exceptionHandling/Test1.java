package exceptionHandling;

import java.io.FileInputStream;

public class Test1 {

	public static void main(String[] args) {
	try {
		int i=1/0;
	}
	catch(ArithmeticException a1) {
	System.out.println(a1);
		
	}
		
		try {
		int a[]= {10,20,30,40};
		System.out.println(a[8]);
		}
		catch(ArrayIndexOutOfBoundsException a)
	{
			System.out.println(a);
	}
	}}
	
