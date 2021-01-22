package constructors;

public class SangeethaMobile {
	String name;
	double price;
	String phonetype;
	
	public SangeethaMobile(String name,double price,String phonetype) {
	this.name=name;
	this.price=price;
	this.phonetype=phonetype;
	}
	

	public static void main(String[] args) {
		SangeethaMobile s=new SangeethaMobile("iphone",899.989,"IOS");	
System.out.println(s.name);
System.out.println(s.price);
System.out.println(s.phonetype);
	}

}
