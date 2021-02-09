package collections;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20.90);
		a.add('A');
		a.add("Java");
		a.add(true);
		
	//	a.clear();
		
		//System.out.println(a.isEmpty());
		System.out.println(a.remove(2));
	}

}
