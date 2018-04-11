package Day1;

public class Customer {
	private String nameCustomer;
	private int ageCustomer;

	
	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public int getAgeCustomer() {
		return ageCustomer;
	}

	public void setAgeCustomer(int ageCustomer) {
		this.ageCustomer = ageCustomer;
	}
	
	// construct
	public Customer(){
		this.setNameCustomer(null);
		this.setAgeCustomer(0);
	}
	
	// truyền biến
	public Customer(String name, int age){
		this.setNameCustomer(name);
		this.setAgeCustomer(age);
	}
	
	//phương thức
	@Override
	public String toString(){
		return "Name:" + this.nameCustomer + ",\t Age: " + this.getAgeCustomer() + ".";
		
	}
}
