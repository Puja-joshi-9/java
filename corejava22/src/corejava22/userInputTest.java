package corejava22;

import java.util.Scanner;

public class userInputTest {
	public static void main(String[] args) {
		
		int a;
		int b;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		 a = sc.nextInt();
		 
		System.out.println("Enter value of b");
		b = sc.nextInt();
		
		int sum = a+b;
		System.out.println("Sum = "+sum); // OR, System.out.println(sum);
		
	}

}
