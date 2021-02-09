package collections;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20.90);
		a.add('A');
		a.add("Java");
		a.add(true);
		
		ArrayList a1=new ArrayList();
		a1.add(200);
		a1.add(30.00);
		a1.add('A');
		a1.add("Java");
		a1.add(true);
		
		//a.addAll(a1);
		//System.out.println(a.containsAll(a1));
		//System.out.println(a.equals(a1));
	//a.removeAll(a1);
		//a.removeAll(a1);
		a.retainAll(a1);
	System.out.println(a);
	}

}
