package array;

public class ArrayAsParam {
	
	public static void main(String[] args) {
		
		int data[] = {30, 40, 45,23,70,32,12,43,45,98};
		
		findSmallestValue(data);
		
		int res[] = getValuesGreaterThan50(data);
		
		System.out.println("size = "+res.length);
		
		for(int x: res) {
			System.out.println(x);
		}
		
	}

	
	// array as arguments
	
	static void findSmallestValue(int input[]) {
		
		int sv = input[0];
		for(int x:input) {
			
			if(sv>x) {
				
				sv = x;
			}
		}
		System.out.println("Smallest value in array is = "+sv);
	}
	
	// array as return-type
	
	static int[] getValuesGreaterThan50(int input[]) {
		
		int result[] = new int[5];
		int i = 0;
		for(int x : input ) {
			
			if(x>50) {
				
				result[i] = x;
				i++;
			}
		}
		
		return result;
		
		}
	
}
