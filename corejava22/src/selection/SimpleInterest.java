package selection;

import java.util.Scanner;

public class SimpleInterest {

	 public static void main(String[] args) {
		
		 float I,P,T,R;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the values of P ,T and R");
		  
		   P = sc.nextFloat();
		   T = sc.nextFloat();
		   R = sc.nextFloat();
		   
		  
		    
		   if(P>0 && T>0 && R>0) {
			   
			   I = (P*T*R)/100;
		
		   
		   System.out.println("The simple interest is = "+I);
		   }
		 
	}
}
