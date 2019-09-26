package oop;

public class Rectangle {
	
	float length;
	float breadth;
	
	
     void PrintArea() {
    	 
    	 System.out.println("Area of reactangle = "+(length*breadth));
		
	}
     
     public static void main(String[] args) {
		
    	 Rectangle R = new Rectangle();
    	 R.length = 90;
    	 R.breadth = 70;
    	 R.PrintArea();
	}

}
