package looping;

public class DoTest {
	
	/*
	 * do{
	 * 
	 *    //statements
	 *    
	 *    //inc/dec
	 * 
	 * } while(condition);
	 */

	
	public static void main(String[] args) {
		
		//6*1=6
		//6*2=12
		//.....
		//6*10=60
		
		int n=6;
		int i=1;
		
		do {
			
			System.out.println(n+" * "+i+" = "+(n*i));
			i++;
		}while(i<=100); 
		
	}
}
