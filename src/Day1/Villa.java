package Day1;

public class Villa implements Abstract {
	private int totalPrice;
	private int totalDate;
	private String name;
	private int numberBed;
	private float size;

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTotalDate() {
		return totalDate;
	}

	public void setTotalDate(int totalDate) {
		this.totalDate = totalDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberBed() {
		return numberBed;
	}

	public void setNumberBed(int numberBed) {
		this.numberBed = numberBed;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	// truyền biến

	public Villa(String nameVilla, Customer customer, int totalDate) {
		this.name = nameVilla;
		this.totalDate = totalDate;
	}

	// get price
	@Override
	public float getCostFinal() {
		return this.PRICE_ONEDATE * this.getTotalDate();
	}

	// lấy tên khách hàng đk
	public String getCustomerInVilla(Customer customer) {
		return customer.toString();
	}

	// lấy tên khách hàng đk ở trong villa
	public String getNameCustomerInVilla(Customer customer) {
		return customer.getNameCustomer();
	}

	// check customer in villa
	public boolean getCheckCustomerInVilla(Customer customer) {
		if (customer.getNameCustomer() == null) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public int getNumberDateStayInResort(int money) {
		int date = 0;
		switch (money) {
		case 100:
			date = money/this.PRICE_ONEDATE;
			break;
		case 50:
			date = money/this.PRICE_ONEDATE;
			break;
		case 30:
			date = money/this.PRICE_ONEDATE;
			break;
		default:
			date = 1;
		}
		return date;
	}
}
