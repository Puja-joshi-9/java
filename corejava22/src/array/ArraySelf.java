package array;

import java.util.jar.Attributes.Name;

public class ArraySelf {

	public static void main(String[] args) {
	
		details();
		
	}
		
		
	

	 static void details() {
		String name= " ";
		float marks = 0;
		
		
		String students[] = new String[3];
		
	
		students[0].name = "Puja";
		students[0].marks = 98;
		
		
		students[1].name = "Gayatri";
		students[1].marks = 95;
		
		
		students[2].name = "Manisha";
		students[2].marks = 94;
		
		for(int i = 0 ; i < 3 ; i++) {
			
			System.out.println(students[i].name + "                "+ students[i].marks);
		
	}
	 }
}
