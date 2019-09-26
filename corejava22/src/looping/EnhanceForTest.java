package looping;

public class EnhanceForTest {
	/*
	 *  for(data-type var : collection){
	 *  
	 *    //statements
	 *    
	 *    }
	 */
	
	public static void main(String[] args) {
		
		int data[] = {30,50,40,10,60,78,90,26,84};
		int sum = 0;
		for(int x : data) {
			
			System.out.println(x);
			sum = sum + x;  //or we can write sum+= x;
		}
		
	System.out.println("Total = "+sum);
	}

}
