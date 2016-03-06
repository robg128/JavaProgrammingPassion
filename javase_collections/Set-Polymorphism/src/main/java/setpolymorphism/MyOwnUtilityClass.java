package setpolymorphism;

import java.util.Set;

public class MyOwnUtilityClass {

	public static void checkDuplicate(Set s, String[] numbers) {
		for (int i = 0; i < numbers.length; i++){
			s.add(numbers[i]);
		}
	}
}
