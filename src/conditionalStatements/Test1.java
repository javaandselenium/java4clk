package conditionalStatements;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//int numb=100;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amt=s.nextInt();
		
		if(amt>50)
		{
			System.out.println("you can withdraw");
		}
		else
		{
			System.out.println("you cannot withdraw");
		}

	}

}
