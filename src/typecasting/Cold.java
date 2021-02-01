package typecasting;

public class Cold extends Hot {

	public void coldcoffee() {
		System.out.println("coldcofee");
	}
	
	public void coldWater() {
		System.out.println("coldwater");
	}
	
	public static void main(String[] args) {
	Hot h=new Cold();
	h.hotcofee();
	h.hotWater();
	
	Cold c=(Cold)h;
	c.hotcofee();
	c.hotWater();
	c.coldcoffee();
	c.coldWater();
	

	}

}
