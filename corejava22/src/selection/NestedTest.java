package selection;

import java.util.Scanner;

public class NestedTest {
	
	/*
	 * if(condition-1){
	 *     
	 *      if(condition-2){
	 *      
	 *            ................ 
	 *            ................
	 *            .................
	 *      
	 *      }else{
	 *      
	 *    }  
	 *      
	 *       }else{
	 *       
	 *       }
	 */

	
	public static void main(String[] args) {
		
		String citizen;
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter citizen and age..");
		
		citizen = sc.nextLine();
		age = sc.nextInt();
		
		
		if(citizen.equals("nepali")) {
			
			  if(age >= 24) {
				  
				  System.out.println("You can vote!!");
			  }else {
				  
				  System.out.println("You are under age!!");
			  }
			
		}else {
			
			System.out.println("You are not nepali!!");
		}
		
}
	
	
}
