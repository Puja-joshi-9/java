package encapsulation;

public class RunCustomer {
	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		c.setId(222);
		c.setFname("Ram");
		c.setLname("Pant");
		c.setAddress("Mnr");
		c.setPhone("980988");
		
//		System.out.println("Id = "+c.getId());
//		System.out.println("FirstName = "+c.getFname());
//		System.out.println("LastName = "+c.getLname());
//		System.out.println("Address = "+c.getAddress());
//		System.out.println("Phone = "+c.getPhone());
		
		System.out.println(c);  //calls toString()
	}

}
