package encapsulation;

public class Student {

	public static void main(String[] args) {
		
		Customer s = new Customer();
		
		s.setAddress("Pokhara");
		s.setFname("Puja");
		s.setId(99);
		s.setLname("Joshi");
		s.setPhone("989898");
		
		System.out.println(s);
			
		
	}
}
