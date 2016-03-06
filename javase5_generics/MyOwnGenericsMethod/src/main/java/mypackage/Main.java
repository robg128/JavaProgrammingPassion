package mypackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<Person>();
		List<Fruit> fruits = new ArrayList<Fruit>();

		Person person = addPersonToCollection(people, new Person("Jim", 5));
		Fruit fruit = addFruitToCollection(fruits, new Fruit("Apple", 100));

		// Note that you can pass any type of Collection object 
		Person person2 = addItemToCollection(people, new Person("Mary", 5));
		displayResult("--->people: ", people);
		Fruit fruit2 = addItemToCollection(fruits, new Fruit("Cherry", 200));
		displayResult("--->fruits: ", fruits);

	}

	// Use concrete type
	public static Person addPersonToCollection(Collection<Person> collection,
			Person element) {
		collection.add(element);
		return element;
	}

	// Use concrete type
	public static Fruit addFruitToCollection(Collection<Fruit> collection,
			Fruit element) {
		collection.add(element);
		return element;
	}

	// Use generic type
	public static <T> T addItemToCollection(Collection<T> collection, T element) {
		collection.add(element);
		return element;
	}
	
	// Utility method to display list of people or fruits
	public static <T> void displayResult(String prefix, List<T> results) {
		System.out.print(prefix);
		for (T item : results) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

}
