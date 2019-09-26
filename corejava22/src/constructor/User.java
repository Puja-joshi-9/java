package constructor;     //Constructor returns only the object. since this doenot have return type this is called implicit return type.

public class User {

	String userName;     // userName is instance variable
	String password;
	
	//1) default constructor
	User(){
		
		userName = "root";
		password = "123";
	}
	
	// 2) Parameterized constructor
	
//	User(String un , String pw){        //pw is local variable here.
//		
//		userName = un;
//	   password = pw;
//	}
	
	
	User(String userName , String password){
		
		this.userName = userName;
		this.password = password;         // this. is used when ambiguity occurs.
	}
	
	
	void printUserInfo() {
		
		System.out.println("UserName = "+ userName);
		System.out.println("Password = "+ password);
	}
	
	public static void main(String[] args) {
		
		//User u = new User();
		//u.password = "puj123";
		
		User u = new User("Ram","4444");
		u.printUserInfo();                  //Object is the parent or root class of java.
		
	}
}
