package javaCollection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Nepal");
		list.add("china");
		list.add("india");
		list.add("us");
		list.add("canada");
		
		// class, interface = API i.e requirements for programming
		// multiple data processing == framework
		// Application Programming Interface
		
		list.remove("us");
		list.remove(2);
		
		for( String S : list) {
			
			System.out.println(S);
		}
	}
	
}