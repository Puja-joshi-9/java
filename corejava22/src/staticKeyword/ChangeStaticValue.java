package staticKeyword;

public class ChangeStaticValue {

	int roll;
	String name ;
	
	static String college = "Trichandra";
	
	static void change () {
		
		college = "NCIT";
	}
	
	ChangeStaticValue (int r , String name){
		roll = r;
		this.name = name;
	}
	
	void display() {
		System.out.println(roll+" "+name+" "+college);
	}
	
	public static void main(String[] args) {
		
		new ChangeStaticValue(151, "Rohan").display();
		
		ChangeStaticValue.change(); // only class calls static member function
		
		new ChangeStaticValue(555, "Bindu").display();
		
		new ChangeStaticValue(135, "static").display();
		
	//	ChangeStaticValue s1;
	
	}
}

// this represent current object
// super represent to parent object
// thus they are associated with objects so cannot be used in context of static.
