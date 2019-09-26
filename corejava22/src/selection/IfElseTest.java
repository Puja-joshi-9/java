package selection;

import java.util.Scanner;

public class IfElseTest {
	/*
	 *  if(condition){
	 *      
	 *      //statements-true
	 *  
	 *  }else{
	 *  
	 *     //statements-false
	 *     
	 *     }
	 */

	
	  public static void main(String[] args) {
		
		  int x,y;
		  
		  Scanner sc = new Scanner(System.in);
				  
				 
		  
		  System.out.println("Enter the values of x and y ");
		    x = sc.nextInt();
		    y = sc.nextInt();
		    
		  if(x==y) {
			  
			  System.out.println("Both are equal.");
		  }
		  
		  
		  if(x>y) {
			  
			  System.out.println("The max value is = "+x);
		  }else {
			  
			  System.out.println("The max value is ="+y);
		  }
		  
		  
				  
	}
	
	
}
