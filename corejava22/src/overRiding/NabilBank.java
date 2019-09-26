package overRiding;

public class NabilBank extends CentralBank{
	
	@Override
	protected String getName() {
		
		return "Prabhu Bank";
	}
	
	@Override
	protected int getRate() {
		
		return 17;
	}

}
