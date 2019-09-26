package selection;

import java.util.Scanner;

public class OperatorSwitch {
	public static void main(String[] args) {
		
	
	
	int a,b;
	char c;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter numbers and operator.");
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.next().charAt(0);
	
	switch ('c') {
	
	case '+' :
	   System.out.println(a+b);
	   break;
	   
	case '-' :
		System.out.println(a-b);
		break;
		
	case '*'	:
		
		System.out.println(a*b);
		break;
		
	case '/'	:
		
		System.out.println(a/b);
		break;
		
	default :
		System.out.println("invalid");
		break;
	}
		

	



}
	

}
