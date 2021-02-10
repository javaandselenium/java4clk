package collections;

import java.util.LinkedList;

public class Test6 {

	public static void main(String[] args) {
	LinkedList l=new LinkedList<>();
	l.add(10);
	l.add(20.90);
	l.add(10);
	l.add(true);
	l.add("");
	l.add('A');
	
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}

	}

}
