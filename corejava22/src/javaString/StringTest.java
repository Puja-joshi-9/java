package javaString;

public class StringTest {
	
	public static void main(String[] args) {
		
		String s = "java developers in nepal";
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(2));
		
		//substring
		
		System.out.println(s.substring(0, 4));
		System.out.println(s.substring(5, 15));
		System.out.println(s.substring(16));
	}

}
