package inheritance;

public class Car extends Vehicle{
	
	private int cc;
	private int gears;
	
	public void attributesCar() {
		//The subclass refers to the members of the superclass
		
		//Syatem.out.println("Color of Car : "+ color);  //Error: private 
		//field: color
		
		System.out.println("Speed of car : "+ super.speed); //super.speed or //speed
		
		
		System.out.println("Size of the car : "+ size);
		
		System.out.println("CC of car :"+ cc);
		System.out.println("No of gears :"+gears);
		
		super.attributes(); //We can use super in any non static method
		

	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		//c1.color = "Blue"; //ERROR : private field:color
		
		c1.speed = 200;
		c1.size = 22;
		c1.cc = 1000;
		c1.gears = 5;
		
		c1.attributes();
		
	
		// super.attributes();  //ERROR : cannot use super in static context.
		
		c1.attributesCar();
		
	}

}
