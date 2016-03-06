package mypackage;

public class Main {

	public static void main(String[] args) {

		// Create object from non-genericized class
		SomethingInteger s1 = new SomethingInteger();
		s1.setThing(new Integer(3));
		// s1.setThing(new String("test")); // compile error

		// Create object from non-genericized class
		SomethingString s2 = new SomethingString();
		// s2.setThing(new Integer(3)); // compile error
		s2.setThing(new String("test"));

	}
}
