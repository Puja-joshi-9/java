package abstraction;

public abstract class Bank {
	
	abstract String getName();
	abstract int getInterestRate();
	
	public void displayMoneyEx() {
		
		System.out.println("$1 = 112");
		System.out.println("Yen 10 = 10");
		System.out.println("KDD 1 = 16");
	}
		
	

}
