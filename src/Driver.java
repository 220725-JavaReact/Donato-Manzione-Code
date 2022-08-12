import java.util.ArrayList;
import java.util.Iterator;

//FUNCTIONAL INTERFACE, i.e. interface with one one abstract method
interface Printable {

	abstract void print(String message);
	
}
public class Driver {

	public static void main(String[] args) {
		//WAYS TO IMPLEMENT A FUNCTIONAL INTERFACE
		//1. - Create class that implements it (Printer below)
		//	 - Instantiate class
		//   - Call method from instance
		
		Printer printer = new Printer(); //instantiate class created below
		printer.print("Hello instance of a class Printer!");
		
		//2. - Use an anonymous class instead of Printer 
		//	(i.e., a class you define and instantiate at the same time)
		
		Printable printerAnonymous = new Printable() {

			@Override
			public void print(String message) {
				System.out.println(message);
				
			}
			
		};
		printerAnonymous.print("Hello anonymous printer");
		
		//3. - User a lambda expression -- no need to instantiate a class,
		//		anonymous or not
		
		Printable printableLambda = n -> System.out.println(n);
		printableLambda.print("Hello lambda");

	
		//lambdas allow us to use aggregate functions such as forEach in collections
		new ArrayList<Integer>() {private static final long serialVersionUID = 1L;

		{
			add(1);
			add(2);
			add(3);
			add(4);
		}}.forEach(x-> System.out.println(x));;
	}
	
	
	
	
}

class Printer implements Printable {

	@Override
	public void print(String message) {
		System.out.println(message);
		
	}
	
}
