package oop;

public class MyBook {
	
	String name;
	float price;
	String author;
	int pages;

	
  void BookInfo() {
	  
	 System.out.println("name of book: "+name+ "     "+"price of book :"+price);
  }
  
  public static void main(String[] args) {
	  
	  MyBook b1 = new MyBook();
	  b1.name = "English";
	  b1.price = 980;
	  b1.pages = 600;
	  b1.BookInfo();
	
}
}
