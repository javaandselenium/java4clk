package collections;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
	ArrayList a=new ArrayList<>();
	a.add(10);
	a.add('A');
	a.add("Hello");
	a.add(true);
	System.out.println(a.get(2));
	System.out.println(a.indexOf('A'));
	System.out.println(a.lastIndexOf(true));
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}

	}

}
