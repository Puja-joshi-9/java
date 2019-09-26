package selection;

import java.util.Scanner;

public class IfElseLadder {
	/*
	 * if(condition-1){
	 * 
	 * }
	 * else if(condition-2){
	 * 
	 * }
	 * else if(condition-3){
	 * 
	 * }
	 * 
	 * els{
	 * 
	 * }
	 * 
	 * 
	 */

	
	public static void main(String[] args) {
		
		int marks;
		
		Scanner sc =new Scanner(System.in);
		
	System.out.println("Enter marks ..");
		
	marks = sc.nextInt();
	
	    if(marks>=80) {
	    	
	    	System.out.println("Distinction");
	    }
	    
	    else if(marks<80 && marks>=60) {
	    	System.out.println("first division");
	    	
	    }
	    else if(marks<60) {
	    	
	    	System.out.println("second division");
	    }
	    else if(marks>=40) {
	    	System.out.println("third division");
	    }
	    
	    else {
	    	System.out.println("Fail");
	    }
	}
}
