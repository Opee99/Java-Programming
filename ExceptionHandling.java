package collectionpractise;

public class ExceptionHandling {

	// Custom Exception (throws & throw)
	static void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Invalid age");
		} else {
			System.out.println("Welcome to vote: Valid age");
		}
	}

	// Built-in Exception (throw)
	static void display() {
		String s = null;
		int n = s.length();
		throw new NullPointerException("Invalid String");
	}

	public static void main(String[] args) {

		// try catch
		try {

			int arr[] = { 1, 4, 7, 9 };
			System.out.println(arr[5]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Thrown: "+e); 
			System.err.println("Error Thrown: "+e);
			e.printStackTrace();//print error with location 
		}
     
		
		System.out.println(process(5,1));
		
		// Nested try catch

		try {
			System.out.println("Nested try-catch");

			try {
				int a = 30, b = 0;
				int c = a / b;
				System.out.println(c);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				String s = "Hello";
				int num = Integer.parseInt(s);
				System.out.println(num);

			} catch (NumberFormatException e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// custom exception handling
		try {
			validate(7);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}

		try {
			display();
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		// finally
		finally{
			System.out.println("Finally the Program is executed");
		}

	}
	
	static int process(int a, int b)
	{
		try
		{
			return a/b;
		}catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}
		finally
		{
			System.out.println("Finally block is executed");
		}
	}

}
