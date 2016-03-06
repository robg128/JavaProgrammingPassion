package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Person[] personArray = { new Person("Jong", 5), new Person("Jon", 12),
				new Person("Jon", 17), new Person("Mary", 13) };

		Fruit[] fruitArray = { new Fruit("Apple", 11), new Fruit("Orange", 22),
				new Fruit("Banana", 33) };

		int numberOfPeople = countAllOccurrences(personArray, new Person("Jon", 12));
		System.out.println("numberOfPeople = " + numberOfPeople);

		int numberOfFruits = countAllOccurrences(fruitArray, new Fruit("Apple", 11));
		System.out.println("numberOfFruits = " + numberOfFruits);

	}

	public static <T> int countAllOccurrences(T[] list, T item) {
		int count = 0;
		for (T listItem : list){
			if (item.equals(listItem)) {
				count++;
			}
		}
		return count;
	}

}
