package javaCollection;

import java.util.HashSet;
import java.util.Set;



public class TreeSet {
	
		
		public static void main(String[] args) {
			
		
		Set<String> hset = new java.util.TreeSet<String>();
		
		hset.add ("Java");
		hset.add("Python");
		hset.add("sql");
		hset.add("python");
		
		for (String S : hset) {
			
			System.out.println(S);
		}
		}
	}


