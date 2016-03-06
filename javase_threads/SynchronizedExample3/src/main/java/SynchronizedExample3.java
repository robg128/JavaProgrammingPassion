
public class SynchronizedExample3 {
    
    public static void main(String[] args) {
        
        TwoStrings ts = new TwoStrings();

        // These threads are synchronized with a single TwoStrings object,
        // which functions as a lock
        new PrintStringsThread("Hello ", "there.", ts);
        new PrintStringsThread("How are ", "you?", ts);
        new PrintStringsThread("Thank you ", "very much!", ts);
    }
    
}
