package typecasting;

public class Book extends Pen{
	public void redBook() {
		System.out.println("redbook");
	}
	
	public static void main(String[] args) {
		Pen p=new Book();
		
		Book b=(Book)p;
		b.bluepen();
		b.redBook();
		b.redBook();
		
		
	}

}
