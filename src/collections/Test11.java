package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test11 {

	public static void main(String[] args) {
		//HashMap<String,Integer>h=new HashMap<String,Integer>();
       // TreeMap<String,Integer>h=new TreeMap<String,Integer>();
        LinkedHashMap<String,Integer>h=new LinkedHashMap<String,Integer>();
		h.put("Ram",123);
         h.put("Raj",423);
         h.put("Jam",923);
         h.put("Dam",123);
         h.put("Sam",923);
         
       System.out.println(h);
         
	}

}
