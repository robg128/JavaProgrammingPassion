package setpolymorphism;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        // Set up test data
        String numbers[] = {
            new String("2"),
            new String("3"),
            new String("4"),
            new String("1"),
            new String("2")
        };

        System.out.println("The numbers are added in the following order ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Random order
        Set s = new HashSet();
        MyOwnUtilityClass.checkDuplicate(s, numbers);
        System.out.println("Set type = " + s.getClass().getName() + " " + s);

        // Natural order based order
        s = new TreeSet();
        MyOwnUtilityClass.checkDuplicate(s, numbers);
        System.out.println("Set type = " + s.getClass().getName() + " " + s);

        // Insertion based order
        s = new LinkedHashSet();
        MyOwnUtilityClass.checkDuplicate(s, numbers);
        System.out.println("Set type = " + s.getClass().getName() + " " + s);
    }
}
