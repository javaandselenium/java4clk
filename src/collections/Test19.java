package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test19 {
	public static void main(String[] args) {
ArrayList t=new ArrayList<>();
	t.add(30);
	t.add(50);
	t.add(40);
	t.add(10);
	t.add(20);
	
	System.out.println("before swapping "+t);
	Collections.swap(t,2,3);
	System.out.println(t);
	
}}
