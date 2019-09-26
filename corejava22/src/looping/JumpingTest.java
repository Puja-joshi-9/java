package looping;

public class JumpingTest {
	
   /*
    *  1. break; // it breaks the looping and continues outside the loop but inside the main method.
    *  2. continue; //it skips the value..run the program below.
    *  3. return;  //it exits the value from main method.
    */
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i==5 || i==2 || i==9) {
				
				//break;
				//continue;
				return;
			}
			
			System.out.println(i);
		}
		
		System.out.println("End for loop");
	}
}

