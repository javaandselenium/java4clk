package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test18 {

	public static void main(String[] args) {
		ArrayList t=new ArrayList<>();
		t.add(30);
		t.add(50);
		t.add(40);
		t.add(10);
		t.add(20);
		System.out.println("before shuffleing "+t);
		Collections.shuffle(t);
		System.out.println(t);

	}

}
