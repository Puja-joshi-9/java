package inheritance;

public class Programmer extends Employee{
	
	String programmingLanguage;
	String project;
	int bonus;
	
	public static void main(String[] args) {
		
		Programmer s = new Programmer();
		
		
		s.bonus = 999;
		s.company = "XYZ";
		s.fname = "Ram";
		s.id = 9;
		s.lname = "Nepali";
		s.programmingLanguage = "java";
		s.project = "abc";
		s.salary = 10000;
		
		System.out.println(s);
	}

}
