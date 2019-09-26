package abstraction;

public class RunBank {
	
	public static void main(String[] args) {
		
//		Bank b = new Bank(); error occurs since we can't make object of child class.
		
		Bank b = new EverestBank();
		System.out.println("Name = " +b.getName());
		System.out.println("Interest = "+b.getInterestRate());
		b.displayMoneyEx();
		
		UserService us = new UserServiceImpl();
		us.addUser();
		us.deleteUser();
	}

}
