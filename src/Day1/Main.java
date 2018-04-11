package Day1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main mainDay01 = new Main();
		Main.run();
	}
	public static void showTask01InDay01(){		
		Customer customer1 = new Customer("Nguyen Van A", 20);
		Villa villa1 = new Villa("Villa VIP01",customer1, 4);
		System.out.println("Name Customer: "+villa1.getCustomerInVilla(customer1));
		System.out.println("Cost         :"+villa1.getCostFinal());
	}
	
	public static void showTask02InDay01() {
		checkAndShowTimeOpenSwimmingPool();
		
		Scanner scanner = new Scanner(System.in);
		Customer customer1 = new Customer("Nguyen Van A", 20);
		Villa villa1 = new Villa("Villa VIP01",customer1, 4);
		System.out.println("----------------------------");
		System.out.print("Input money: ");
		int moneyVilla = scanner.nextInt();
		System.out.println(villa1.getNumberDateStayInResort(moneyVilla));
	}
	
	public static void checkAndShowTimeOpenSwimmingPool() {
		float timeSwimming;
		SwimmingPool swp = new SwimmingPool();
		swp.getOpenTimeInScreen();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input time Customer request: ");
		timeSwimming = scanner.nextFloat();
		if (timeSwimming < 9) {
			System.out.println("Go back at 9:00 am");
		}
		else {
			System.out.println("Welcome...");
		}
	}

	public static void run() {
		showTask01InDay01();
		showTask02InDay01();
	}

}
