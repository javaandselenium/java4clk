package interacepackage;

public class Child implements Parent1,Parent2,Parent3{

	@Override
	public void home() {
	System.out.println("home");
	}

	

	@Override
	public void car() {
		System.out.println("car");
		
	}



	@Override
	public void bike() {
		System.out.println("bike");
	}
public static void main(String[] args) {
	Child c=new Child();
	c.car();
	c.bike();
	c.home();
}
}
