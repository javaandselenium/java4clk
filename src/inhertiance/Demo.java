package inhertiance;

public class Demo extends Test1{
	public void mul() {
		System.out.println("mul");
	}

	public static void main(String[] args) {
		Demo d=new Demo();
		d.add();
		d.sub();
		d.mul();

	}

}
