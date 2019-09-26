package javaString;

public class ImmutableTest {
	
	public static void main(String[] args) {
		
		String s = "visit nepal";
		s.concat("2020");    // s is immutable , does not change state.
		System.out.println(s);
		
		//mutable object
		
		StringBuffer sb= new StringBuffer("visit nepal");
		
		//sb.append(" 2020");
		//sb.insert(1, "welcome");
		//sb.delete(0, 6);
		//sb.reverse();
		
		System.out.println(sb);
		
	}

}
