package array;

import java.util.Scanner;

public class Array2 {
	
	
	public static void main(String[] args) {
		
		double priceOfBooks[] = new double[10];
		
		 Scanner sc = new Scanner(System.in);
		 
		 
		 for(int i= 0; i<10 ; i++) {
			 
			 System.out.println("Enter the price of books .");
			 priceOfBooks[i] = sc.nextDouble();
		 }
		 
		
		 for(double x : priceOfBooks) {
			 
			 System.out.println(x);
		 }
		 
		 
		 
	}

}
