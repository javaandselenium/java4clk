package encapsulation;

public class Test0 {

	private String name="John";
	private int empid=123;
	private double sal=89.98;
	private String location="Bangalore";
	private String DOB="28-May-1234";
	
	
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public int getEmpid() {
		return empid;
	}
	public String getDOB() {
		return DOB;
	}
	
	

}
