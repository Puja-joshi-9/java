package overRiding;

public class CentralBank {
	
	protected String getName() {
		
		return "Central Bank";
	}

	protected int getRate() {
		
		return 0;
	}
	
	public void displayMoneyEx() {
		
		System.out.println("$1 = 112");
		System.out.println("Yen 10 = 10");
		System.out.println("IC 100 = 160");
	}
}
