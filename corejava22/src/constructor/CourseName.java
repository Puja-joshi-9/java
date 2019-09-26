package constructor;

public class CourseName {
	
	 String course;
	
	public CourseName() {
		
		course ="JAVA";
		
	}
	
	void showCourseName() {
		System.out.println("Course Name is :"+ course);
	}
	
	public static void main(String[] args) {
		
		CourseName course = new CourseName();   // Constructor called first
		
		course.showCourseName();        //CourseName is : JAVA
	}

}
