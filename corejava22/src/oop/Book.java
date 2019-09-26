package oop;

public class Book {
	
	String name;
	float price;
	String author;
	int pages;
	
	
	
	void displayBookInfo() {
		
	System.out.println(name);
	
		
		
		
	}
	
	public static void main(String[] args) {
		
		Book b = new Book();
		b.name = "maths";
		b.price = 690;
		b.pages = 900;
		b.displayBookInfo();
		
	}
	

}
