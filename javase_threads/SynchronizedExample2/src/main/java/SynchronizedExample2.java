
public class SynchronizedExample2 {
    
    public static void main(String[] args) {

        // Create commonly shared object instance
        TwoStrings ts = new TwoStrings();

        // These threads are synchronized with a single TwoStrings object,
        // which functions as a lock
        new PrintStringsThread("Hello ", "there.", ts);
        new PrintStringsThread("How are ", "you?", ts);
        new PrintStringsThread("Thank you ", "very much!", ts);
    }
    
}
