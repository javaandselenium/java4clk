package collections;

import java.util.LinkedList;

public class Test14 {

	public static void main(String[] args) {
	LinkedList l=new LinkedList<>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	
	System.out.println("The first obj "+l.getFirst());
	System.out.println("The last obj "+l.getLast());
	
	System.out.println(l);
	

	}

}
