package selection;

import java.util.Scanner;

public class SwitchTest {
	/*
	 *  switch(expression){
	 *  
	 *        case 1:
	 *        
	 *              //statements
	 *           break;
	 *           
	 *         case 2 :
	 *         
	 *           //statements
	 *           
	 *           break;
	 *           
	 *         case 3 :
	 *         //statements
	 *         break;
	 *         
	 *           ..........
	 *           ..........
	 *           
	 *          default :
	 *          
	 *           //statements
	 *           break;
	 *  
	 *  }
	 */
 
	
	public static void main(String[] args) {
		
		int day;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day .");
		
		day = sc.nextInt();
		
		switch(day) {
		
		case 1 :
			System.out.println("Sunday");
			break;
			
		case 2 :
			System.out.println("Monday");
			break;
			
			
		case 3 :
			System.out.println("Tuesday");
			break;
			
		case 4 :
			System.out.println("wednesday");
			break;
			
		case 5 :
		    System.out.println("thursday");
		    break;
		    
		case 6: 
			System.out.println("friday");
			break;
			
		case 7 :
			System.out.println("saturday");
			break;
			
		default :
			System.out.println("invalid");
			break;
			
			
		}	
				
				
	}
}
