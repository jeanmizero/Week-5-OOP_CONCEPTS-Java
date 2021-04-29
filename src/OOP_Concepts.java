
public class OOP_Concepts {

	public static void main(String[] args) {
		// Create Student1
		Student student1 = new Student();
		student1.firstName = "Tom";
		student1.lastName = "Smith";
		student1.gradeLevel = 12;
		student1.phoneNumber = "435-300-8494";
		
		student1.introduce();
		
		// Create Student2
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		// Create Student2
		Student student3 = new Student("Tom", "Brady", 10);
		student3.introduce();
		

	}

}
