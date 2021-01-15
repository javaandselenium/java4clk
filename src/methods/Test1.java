package methods;

public class Test1 {
	static int depositAmt=1000;
	static int withdrawalAmt=500;
	
	public static void withdrawalAmount() {
	int	bal=depositAmt-withdrawalAmt;
		System.out.println(bal);
	}
	
	

	
	public static void main(String[] args) {
		withdrawalAmount();
	}

}
