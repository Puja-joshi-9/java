package overRiding;

public class EverestBank extends CentralBank{
	
	@Override
	protected String getName() {
		
		return "Everest Bank";
	}
	
	@Override
	protected int getRate() {
		
		return 10;
	}
	
	

}
