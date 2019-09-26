package corejava22;

public class datatype {
	/*
	 * 1. Primitive 
	 * 
	 *    a) byte  -  Byte
	 *    b) short -  Short   
	 *    c) int  -  Integer
	 *    d) long  -  Long
	 *    e) float  -  Float
	 *    f) double  - Double
	 *    g) char    -  Character
	 *    h) boolean  - Boolean
	 *    
	 * 2. Non primitive
	 * 
	 *    a) String
	 *    b) Arrays
	 *    c) Classes
	 *    d) File
	 *    e) Collections
	 *   
	 */
     
	public static void main(String[] args) {
		
		
		 long a = 50000000000l;
		 float d = 1.5f;
		 
		 
		 System.out.println("byte ="+Byte.SIZE+" "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
		 System.out.println("short ="+Short.SIZE+" "+Short.MIN_VALUE+" "+Short.MAX_VALUE);
		 System.out.println("int ="+Integer.SIZE+" "+Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
		System.out.println("long ="+Long.SIZE+" "+Long.MIN_VALUE+" "+Long.MAX_VALUE);
		System.out.println("float ="+Float.SIZE+" "+Float.MIN_VALUE+" "+Float.MAX_VALUE);
		System.out.println("double ="+Double.SIZE+" "+Double.MIN_VALUE+" "+Double.MAX_VALUE);
		System.out.println("char ="+Character.SIZE+" "+Character.MIN_VALUE+" "+Character.MAX_VALUE);
		
	}
}
