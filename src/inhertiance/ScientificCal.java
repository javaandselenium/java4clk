package inhertiance;

public class ScientificCal extends BasicCal{
	
	public void sinteta() {
		System.out.println("sineteta");
	}
	
	public void costeta() {
		System.out.println("costeta");
	}

	public static void main(String[] args) {
		ScientificCal s=new ScientificCal();
		s.sinteta();
		s.costeta();
		s.add();
		s.sub();
		

	}

}
