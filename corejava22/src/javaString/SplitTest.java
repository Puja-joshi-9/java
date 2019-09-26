package javaString;

public class SplitTest {
	
	public static void main(String[] args) {
		
		String s = "visit Nepal 2020 life time Experience Nepal ";
		
		String words[] = s.split("\\s");
		
		int cnt = 0;           //to count the number of specified word.
		
		for(String w: words) {
			
			if(w.equalsIgnoreCase("nepal"))   //to count the no. of specified word.
				cnt++;
		
			
		System.out.println(w);
		}
		
         System.out.println(cnt);
	}

}
