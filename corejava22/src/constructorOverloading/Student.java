package constructorOverloading;

public class Student {
	
	int id ;
	int age;
	String name;
	
	
	public Student(int i , String n) {
		id = i;
		name = n;
		
	}

	public Student(int i , String n , int a) {
		id = i;
		name = n;
		age = a;
		
	}
	
	public void display() {
		System.out.println(id + " "+ name +" "+ age);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101 , "Rajesh");
		s1.display();
		
		Student s2 = new Student(102 , "Rahul");
		s2.display();
	}
}
