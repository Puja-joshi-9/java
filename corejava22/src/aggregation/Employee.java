package aggregation;

public class Employee {
	
	int id;
	String name;
	String address;
	Car car;           //HAS-A relationship or aggregation

	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.setModel("XYZ");
		c.setCompany("TATA");
		c.setColor("Blue");
		c.setCc(400);
		c.setGears(6);
		c.setPrice(780000000);
		
		Employee emp = new Employee();
		emp.id = 3333;
		emp.name = "Puja";
		emp.address = "Mnr";
		emp.car = c;
		
		System.out.println("Name = "+emp.name);
		System.out.println("=========Car info==========");
		System.out.println("Model ="+emp.car.getModel());
		System.out.println("Color ="+emp.car.getColor());
		
			
	}
}
