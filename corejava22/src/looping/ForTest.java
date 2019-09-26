package looping;

public class ForTest {
	/*
	 *  for(initialization; condition;inc/dec){
	 *  
	 *       //statements
	 *  }
	 */
 
	public static void main(String[] args) {
		
		int esum = 0;
		int osum = 0;
		
		for(int i=1; i<=100 ;i++) {
			
			if(i%2==0) {
				
				 esum = esum + i;
			}else {
			
			osum = osum + i;
			
		}
		}
	
		System.out.println("Sum of even no. = "+esum);
		System.out.println("sum of odd no. = "+osum);
		System.out.println("====================");
		System.out.println("Total sum = "+(esum + osum));
}
}