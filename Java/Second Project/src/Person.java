
public class Person {
	
	//Variables
	public String name;
	public int age;
	public String gender;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creates a person object named 'mySelf'
		Person Bill = new Person();
		Person Joe = new Person();
		
		//Sets name and age of Person 'mySelf'
		Bill.age = 4500;
		Bill.name = "Bill";
		Bill.gender = "Male";
		
		//Sets name and age of Person'Joe'
		Joe.age = 10000;
		Joe.name = "Joe";
		Joe.gender = "Male";
		
		//Print name and age of Bill
		System.out.println("Name: " + Bill.name);
		System.out.println("Age: " + Bill.age);
		System.out.println("Gender: " + Bill.gender);

		//Prints name and age of Joe
		System.out.println("Name: " + Joe.name);
		System.out.println("Age: " + Joe.age);
		System.out.println("Gender: " + Joe.gender);
		
		//Calls method on Person Bill
		Bill.addAge();
		System.out.println("Age: " + Bill.age);
				
		//Object equal to one another
		
		//If statements
		
		if(Bill.isSame(Joe)){ //Is the statement in () true or false
			System.out.println(Bill.name + " and" + Joe.name + " are twins!");
		}
		else {
			System.out.println(Bill.name + " and " + Joe.name + " are not twins!");
		}
	}
	
	public void addAge (){
		
		this.age += 1;
	}
	
	public boolean isSame(Person p){ 
		
		return this == p;
	}

	}
