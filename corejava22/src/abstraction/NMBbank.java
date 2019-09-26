package abstraction;

public class NMBbank extends Bank{

	@Override
	String getName() {
		
		return "NMB Bank";
	}

	@Override
	int getInterestRate() {
	
		return 17;
	}

}
