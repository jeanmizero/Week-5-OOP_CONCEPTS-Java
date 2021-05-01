public class Student {
	//create shared property
	static int numberOfStudents;
	// Create properties of class Student
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int gradeLevel;
	//Put parameters inside parantheses
	
	public Student() {}
	/*
	 * Constructor
	 */
	
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
	/*
	 * Public methods
	 */
	// Create methods/action of class Student
	public void introduce() {
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade" + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);
	}
	
	/*
	 * Private methods 
	 */
	private boolean checkLength(String str, int length) {
		return str.length() > length;
		
	}
	
	
	/*
	 * Getters and Setters
	 */
//	Access(getting data) and mutator(data)
	public void setFirstName(String firstName) {
		if(firstName.length() > 1) {
			this.firstName = firstName;		
		}
	}
	public String getFistName() {
		return firstName;
		
	}
	
	public void setLastName(String lastName) {
		if(checkLength(lastName, 1)) {
			this.lastName = lastName;
		}
	}
	public String getLastName() {
		return lastName;
		
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(checkLength(phoneNumber, 9)) {
			this.phoneNumber = phoneNumber;	
		}
	}
	public String getPhoneNumber() {
		return phoneNumber;
		
	}
	
	public void setGradeLevel(int gradeLevel) {
		if (gradeLevel > 0 && gradeLevel < 13) {
			this.gradeLevel = gradeLevel;
			
		}
		
	}
	public int getGradeLevel() {
		return gradeLevel;
		
	}
	
	

}
