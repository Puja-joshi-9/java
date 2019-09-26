package array;

import java.util.Scanner;

public class MultiDArray {

	/*
	 * data-type array-name[][] = new data-type[row][col];
	 */
	
	public static void main(String[] args) {
		int mat[][] = new int[2][2];
		
		Scanner sc = new Scanner(System.in);
		
		//store data in multiDArray
		
		for(int i = 0 ; i<2 ; i++) {
			
			for(int j=0 ; j<2 ; j++) {
				
				System.out.println("Enter the value for matrix ");
				mat[i][j] = sc.nextInt();
			}
			
		}
		
		// display data from multiDArray
		
		for(int i = 0; i<2 ; i++) {
			
			for(int j=0; j<2 ; j++) {
				
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println();
			
		}
		
	}
}

