package collections;

import java.util.HashSet;

public class Test16 {

	public static void main(String[] args) {
		HashSet set1=new HashSet<>();
		set1.add(30);
		set1.add(40);
		set1.add(20);
		set1.add(10);
		
		HashSet set2=new HashSet<>();
		set2.add(300);
		set2.add(40);
		set2.add(200);
		set2.add(10);
		
		System.out.println(set1.retainAll(set2));
		
		System.out.println(set1.removeAll(set2));
		
		
		
		
		
	}

}
