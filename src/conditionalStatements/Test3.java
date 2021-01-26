package conditionalStatements;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=s.nextInt();
		if(marks>80)
		{
			System.out.println("FCD");
		}
		else if(marks>60)
		{
			System.out.println("FC");
		}
		else if(marks>40)
		{
			System.out.println("SC");
		}
		else if(marks>20)
		{
			System.out.println("TC");
		}
		else
		{
			System.out.println("Go home");
		}

	}

}
