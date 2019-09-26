package selection;

import java.util.Scanner;

public class IfTestKeyboard {
	
	public static void main(String[] args) {
		
		int salary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your salary ? ");
		  salary = sc.nextInt();
		  
		  
		  
		  if (salary <=20000) {
			  
			  salary = salary + 1000;
			  
		  }
		  System.out.println("Total Salary = "+salary);
		  
		  sc.close();
		
}

}
