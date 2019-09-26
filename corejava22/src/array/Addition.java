package array;

public class Addition {
	
	public static void main(String[] args) {
		int mat1[][] = {{60,80},{40,5}}; 
		int mat2[][] = { {6,9},{23,4}};
		
		int mat3[][] = new int[2][2];
		
		//addition
		
		for(int i=0 ; i<2 ; i++) {
			
			for(int j=0 ; j<2 ; j++) {
				
				mat3[i][j] = mat1[i][j]+ mat2[i][j];
				
				//print mat3[][]
				
				System.out.print(mat3[i][j]+"   ");
				
			}
			
			System.out.println();
		}
	}

}
