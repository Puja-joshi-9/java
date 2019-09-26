package array;

import java.util.Scanner;

public class ArrayTest {
	
	/*
	 *  data-type array-name[] = new data-type[size];
	 */

	
	public static void main(String[] args) {
		
		int age[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
	// data store in array.
		
		for(int i = 0; i<5 ; i++) {
			
			System.out.println("Enter your age?");
			age[i] = sc.nextInt();
		}
		
//		age[0] = 20;
//		age[1] = 30;
//		age[2] = 40;
//		age[3] = 50;
//		age[4] = 60;
		
		//display data from array.
		
		for(int x : age) {
			System.out.println(x);
		}
	}
}
