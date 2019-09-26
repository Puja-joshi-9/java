package array;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int input[]= {49,58,20,4,5,2,13,23,3432,894};
		
		Arrays.sort(input);
		
		for(int x : input) {
			System.out.println(x);
		}
		
		//reverse array
		
		System.out.println("========== reverse array values========");
		
		for(int i = input.length-1 ; i>=0 ;i--) {
			
			System.out.println(input[i]);
		}
	}
}
