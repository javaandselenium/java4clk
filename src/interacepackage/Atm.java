package interacepackage;

public class Atm implements Test1 {

	@Override
	public void cardinsert() {
	System.out.println("card");
		
	}

	@Override
	public void enterthepin() {
		System.out.println("pin");
		
	}

	@Override
	public void receiveamt() {
		System.out.println("amt");
	}
	public static void main(String[] args) {
		Atm a=new Atm();
		a.cardinsert();
		a.enterthepin();
		a.receiveamt();
		
	}

}
