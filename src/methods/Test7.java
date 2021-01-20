package methods;

public class Test7 {
	public static void send(String msg) {
     System.out.println(msg);
	}

	public static void send(int numb) {
   System.out.println(numb);
	}

	public static void send(int numb,String msg) {
   System.out.println(numb+" "+msg);
	} 

	public static void main(String[] args) {
		Test7.send("hello");
		Test7.send(85678678,"bye");
	}

}
