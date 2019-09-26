package objectAsParam;

public class TestStudent {
	
	public static void main(String[] args) {
		
//		Student s1 = new Student();
		
//		s1.setFname(" Puja ");
//		s1.setLname(" Joshi ");
//		s1.setId(2);
//		s1.setRoll(37);
//		s1.setPhone("989898");
//		s1.setAddress("KTM");
		
		
		
		TestStudent ts = new TestStudent();
		
//		ts.displayStudentInfo(s1);
		
		ts.displayStudentInfo(ts.getStudentData());
	
		
	}
	
	//object as arguments
	
	void displayStudentInfo(Student s) {
		
		System.out.println("Id = " + s.getId());
		System.out.println("FName = " + s.getFname());
		System.out.println("LName = " + s.getLname());
		System.out.println("Phone = " + s.getPhone());
		System.out.println("Address = " + s.getAddress());
		System.out.println("Roll = "+ s.getRoll());
		
	}
	
	// object as return type
	
	Student getStudentData() {
		
		Student s1 = new Student();
		
		s1.setFname("Puja");
		s1.setLname("Joshi");
		s1.setId(2);
		s1.setRoll(37);
		s1.setPhone("989898");
		s1.setAddress("KTM");
		
		return s1;
		
	}

}
