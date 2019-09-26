package abstraction;

public class EverestBank extends Bank {

	@Override
	String getName() {
		return "Everest";
	}

	@Override
	int getInterestRate() {
		return 16;
	}

}
