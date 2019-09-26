package method;

import java.util.Scanner;

public class MethodSelf {
	
	public static void main(String[] args) {
		
		input();
	}
	
	static void input(){
		
		int P ,T ,R;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the values of P,T and R ");
		
		P = sc.nextInt();
		T = sc.nextInt();
		R = sc.nextInt();
		
	processing(P, T, R);     // called processing here for the values of P,T,R.
		
	}
	
	static void processing(int P, int T, int R) {
		
		int I = (P*T*R)/100;
		
		output(P, I);
	}
	
	static void output(int P , int I) {
		 int A= P+ I;
		 
			
		 System.out.println("Simple interest = "+I);
		 System.out.println("Amount ="+A);
		 
	 }
	

}
