package Day2;

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
	// khởi tạo
	public Customer() {
		this.setNameCustomer(null);
		this.setAgeCustomer(0);
	}
	
	// truyền tham số
	public Customer(String name, int age) {
			this.setNameCustomer(name);
			this.setAgeCustomer(age);
	}
	
	@Override
	public String toString() {
		return this.nameCustomer+",\t Age: "+this.getAgeCustomer()+".";
	}
}
