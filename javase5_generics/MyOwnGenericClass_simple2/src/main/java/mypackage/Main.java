package mypackage;

public class Main {

	public static void main(String[] args) {

		// Create object from Sgenericized class
		SomethingGeneric<Integer> s3 = new SomethingGeneric<Integer>();
		s3.setThing(new Integer(3));
		// s3.setThing(new String("test")); // compile error

		// Create object from Sgenericized class
		SomethingGeneric<String> s4 = new SomethingGeneric<String>();
		// s4.setThing(new Integer(3)); // compile error
		s4.setThing(new String("test"));

	}
}
