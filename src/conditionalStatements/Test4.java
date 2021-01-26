package conditionalStatements;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("day of the week");
		int weekday=s.nextInt();
		
		switch(weekday)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thrusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
			default:
			System.out.println("no day of the week");
		}
		

	}

}
