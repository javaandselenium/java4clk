package collections;

import java.util.ArrayList;

public class Test0 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20.90);
		a.add('A');
		a.add("Java");
		a.add(true);
		System.out.println(a.size());
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}

		
	}

}
