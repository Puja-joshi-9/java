package overRiding;

public class PrabhuBank extends CentralBank {
	
	@Override
	protected String getName() {
		
		return "Prabhu Bank";
	}
	
	@Override
	protected int getRate() {
		
		return 16;
	}
	
	

}
