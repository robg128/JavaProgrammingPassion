package mypackage;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Read a number from System.in
        System.out.println("Enter some number!");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.printf("Entered number is %d\n", i);

        // The scanner can also use delimiters other than whitespace.
        // This example reads several items in from a string:
        String input = "1 fish 2 fish red fish blue fish";
        // "\\s*fish\\s*" delimiter - any number of whitespace character followed by
        // fish followed by any number of whitespace character
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();
    }
}
