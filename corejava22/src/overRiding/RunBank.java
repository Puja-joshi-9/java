package overRiding;

public class RunBank {
	
	public static void main(String[] args) {
		
	  //Static or early binding of object.
		EverestBank eb = new EverestBank();
		
		System.out.println("Bank Name = "+eb.getName());
		System.out.println("Interest Rate = "+eb.getRate());
		eb.displayMoneyEx();
		
		
		// up-casting (i.e object of child class can be created in the reference of parent class)
	       CentralBank pb = new PrabhuBank();
	       PrintBankInfo(pb);
		
		
	}
	
	
	//late or dynamic binding of object

	static void PrintBankInfo(CentralBank pb) {   // it can call even child classes to call. it helps us to make method dynamic.we don't have to create separate method to display separate child class;
		
		System.out.println("Bank Name = "+pb.getName());
		System.out.println("Interest Rate = "+pb.getRate());
		pb.displayMoneyEx();
		
	}
}
