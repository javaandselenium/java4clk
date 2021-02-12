package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test12 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add(90.00);
		a.add('A');
		a.add("Hello");
		ListIterator itr=a.listIterator();
		
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}
System.out.println("***********");
while(itr.hasPrevious()) {
	Object obj1 = itr.previous();
	System.out.println(obj1);
}
	}

}
