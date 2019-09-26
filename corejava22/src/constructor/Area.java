package constructor;

public class Area {

	int length;
	int breadth;
	
	public Area(int length , int breadth) {
		
		this.length = length;
	    this.breadth = breadth;
	}
	
	public void calculateArea() {
		
		int area = length * breadth;
		System.out.println("Area is:"+" "+area);
		
	}
	
	public static void main(String[] args) {
		
		Area area = new Area(5,8);
		
		area.calculateArea();
	}
}
