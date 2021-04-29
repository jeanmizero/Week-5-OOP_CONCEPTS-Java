public class Student {
	//create shared property
	static int numberOfStudents;
	// Create properties of class Student
	String firstName;
	String lastName;
	String phoneNumber;
	int gradeLevel;
	//Put parameters inside parantheses
	
	public Student() {}
	
	// Create Student2
	public Student(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// Create Student3
		public Student(String firstName,String lastName,int gradeLevel) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.gradeLevel = gradeLevel; 
		}
	
	// Create Student1
	public Student(String firstName,String lastName, String phoneNumber, int gradeLevel) {
		//use this keyword from class instance ()
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel;
			
	}
	// Create methods/action of class Student
	public void introduce() {
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade" + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);
	}
	

}
