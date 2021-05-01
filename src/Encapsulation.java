
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setFirstName ("Sally");
		student.setPhoneNumber("800 522 7777");
		System.out.println(student.getFistName());
		/*
		 * Access Modifiers
		 * public:  accessible everywhere
		 * private: only accessible within the class itself
		 * protected: accessible within the class, other classes in the same package,and all subclasses
		 * No Modifier: Same as protected, except not accessible in subclass in different package
		 */
		

	}

}
