package polymorphism;

public class Ecommerce {
public void shopping() {
	System.out.println("Shopping");
}}

class Myntra extends Ecommerce{
	public void shopping() {
		System.out.println("Shopping from myntra");
	}
}

class Amazon extends Ecommerce{
	public void shopping() {
		System.out.println("Shopping from Amazon");
	}
}

class Flipkart extends Ecommerce{
	public void shopping() {
		System.out.println("shopping from flipkart");
	}
}




