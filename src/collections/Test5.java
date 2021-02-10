package collections;

import java.util.Vector;

public class Test5 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20.90);
		v.add("Hello");
		v.add('A');
		v.add(10);
		v.add("");
		v.add(10);
		v.add("");
		v.add(true);
		System.out.println("Size of the vector "+v.size());
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		System.out.println("capacity of the vector "+v.capacity());
		
	}

}
