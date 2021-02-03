package as1;

import accessSpecifiers.Test0;
import accessSpecifiers.Test2;
import accessSpecifiers.Test4;
import accessSpecifiers.Test6;

public class Test5 extends Test4{

	public static void main(String[] args) {
		Test0 t=new Test0();
		System.out.println(t.a);
		t.demo();
		
		Test5 t1=new Test5();
		System.out.println(t1.a);
		t1.add();
		
		Test6 t6=new Test6();
		System.out.println(t6.a);
		t6.add();


	}

}
