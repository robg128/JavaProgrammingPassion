
package sethashsetadd;

import java.util.HashSet;

public class Main {
    

    public static void main(String[] args) {
        
        // Create HashSet object
        HashSet hs1 = new HashSet(5, 0.5f);
        System.out.println(hs1.add("one"));
        System.out.println(hs1.add("two"));
        System.out.println(hs1.add("three"));
        System.out.println(hs1.add("two"));
        
        // Print out the HashSet object
        System.out.println(hs1);
        
        // Create HashSet object
        HashSet hs2 = new HashSet(5, 0.5f);
        System.out.println(hs2.add("one"));
        System.out.println(hs2.add("two"));
        System.out.println(hs2.add("three"));
        System.out.println(hs2.add("three"));

        // Print out the HashSet object
        System.out.println(hs2);

        System.out.println("hs1 == hs2 ?" + (hs1 == hs2));
        System.out.println("hs1.equals(hs2) ?" + (hs1.equals(hs2)));
        
    }
    
}
