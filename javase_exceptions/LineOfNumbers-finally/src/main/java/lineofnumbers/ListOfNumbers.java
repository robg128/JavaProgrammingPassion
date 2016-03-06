package lineofnumbers;
import java.io.*;
import java.util.Vector;

public class ListOfNumbers {
    private Vector victor;
    private static final int SIZE = 10;
    
    public ListOfNumbers() {
        victor = new Vector(SIZE);
        for (int i = 0; i < SIZE; i++)
            victor.addElement(new Integer(i));
    }
    
    public void writeList() {
        PrintWriter out = null;
        
        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
            
            for (int i = 0; i < SIZE; i++)
                System.out.println("Value at: " + i + " = " + victor.elementAt(i));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " +
                    e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Finally: Closing PrintWriter");
                out.close();
            } else {
                System.out.println("Finally: PrintWriter not open");
            }
        }
    }
}
