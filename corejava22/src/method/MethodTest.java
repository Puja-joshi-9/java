package method;

public class MethodTest {
	
	public static void main(String[] args) {
		
		sum();                        //we can not directly call non static method to static method.
		sub(800 , 400);
		int x = sumOf100Num();
		int b =  findSmallestValue(9,100);
		
		System.out.println("Sum of 100 numbers = "+x);
		System.out.println("Smallest Value = "+b);
		
	}
     
	// 1. no return-type with no arguments
	
	 static void sum() {
		
		int a = 200;
		int b = 500;
		
		int sum = a+b;
		
		System.out.println("Total sum = "+sum);
		
	}
	 
	 // 2. no return-type with arguments
	  static void sub(int a , int b) {
		   
		   int c = a-b;
		   System.out.println("Result = "+c);
	   }
	 
	  
	  // 3. return-type with no arguements
	   
	  static int sumOf100Num() {
		   
		   int sum = 0;
		   
		   for(int i = 1;i<=100 ; i++) {
			   
			   sum = sum + i;
		   }
		   
		   return sum;
		   
	   }
	 
	  // 4. return type with arguments.
	  
	 static int findSmallestValue(int x, int y) {
		  
		  if (x<y) {
			  
			  return x;
		  }else {
			  
			  return y;
		  }
		  
	  }
	
	
	
	
}
