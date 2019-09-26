package javaCollection;

import java.util.TreeSet;
import java.util.Set;

public class SetTest {
	
	public static void main(String[] args) {
		
	
	//Set<String> hset = new HashSet<String>();
	Set<String> hset = new TreeSet<String>();
	
	hset.add ("Java");
	hset.add("Python");
	hset.add("sql");
	hset.add("python");
	
	for (String S : hset) {
		
		System.out.println(S);
	}
	}
}
