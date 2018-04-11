package Day1;

public class SwimmingPool {
	private String openTime;
	
	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	
	// constructor
	public SwimmingPool(){
		this.setOpenTime("9:00 am");
	}
	
	// method
	public void getOpenTimeInScreen(){
		System.out.println("Swimming pool open: " + getOpenTime());
	}
}
