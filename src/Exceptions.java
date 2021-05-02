import java.io.FileNotFoundException;

public class Exceptions {

	public static void main(String[] args) {
		int[]numbers = new int[3];
		System.out.println("Hi");
		if (numbers.length > 3) {
			System.out.println(numbers[3]);
		}
		System.out.println("Bye");
		/*
		 * Checked exception: explicitly check for in our code.
		 * try catch block: handles checked exception
		 * Unchecked Exception : something we have control over only occurs if we make mistake in code
		 */
		
		try {
			FileReader fileReader = new FileReader("Something.txt");
			
			
		}catch(FileNotFoundException e) {
			System.out.println(e.toString());
			
		}catch(Exception e) {
			
		}finally{
			System.out.println("Finaly");
		}
		System.out.println("After the try catch");
	}
	public static FileReader openFile(String filename) throws FileNotFoundException{
		return new FileReader(fileName);
	}
	

}
