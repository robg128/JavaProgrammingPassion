package mypackage;

import java.util.*;

public class UsingEnhancedForLoop {
    
    public static void main( String[] args ) {
        
        List<Object> c = new ArrayList<Object>();
        c.add( new String( "Hello World" ) );
        c.add( new Integer( 10 ) );
        c.add( new Double( 11.0 ) );
        c.add( new Long( 12 ) );
        
        for ( Object o : c ) {
            System.out.println( " Collection element is: " + o );
        }
        
        
        String [] s = {
            "Java 2",
            "Platform",
            "Standard",
            "Edition",
            "1.5",
            "is",
            "the",
            "latest",
            "release",
            "of",
            "the",
            "Java",
            "Platform" };
        
        for ( String i : s ) {
            System.out.println( " String Array element is: " + i );
        }
        
    }
}