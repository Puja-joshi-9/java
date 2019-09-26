package staticKeyword;

public class Student {
	
	int roll;
	String name;
	static String college = "ITS";
	
	Student (int r , String name){
		
		roll = r;
		this.name = name;
	}
	
	void display() {
		
		System.out.println(roll + " "+name +" "+college);
	}

	public static void main(String[] args) {
		Student s1 = new Student(111, "Raam");
		
		s1.display();
		new Student(555,"Shyam").display();
	}
}
