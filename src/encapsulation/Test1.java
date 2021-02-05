package encapsulation;

public class Test1 {

	public static void main(String[] args) {
		Test0 t=new Test0();
		
		System.out.println(t.getDOB());
		System.out.println(t.getEmpid());
		System.out.println(t.getLocation());
		t.setLocation("Mysore");
		System.out.println(t.getLocation());
		System.out.println(t.getName());
		System.out.println(t.getSal());
		t.setSal(89087);
		System.out.println(t.getSal());
		
		

	}

}
