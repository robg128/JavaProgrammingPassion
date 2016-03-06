
public class TwoStrings {
    
    // This method is now synchronized
    synchronized static void print(String str1, String str2) {
        System.out.print(str1);
        try {
            // Causes the currently executing thread to sleep (temporarily
            // cease execution) for the specified number of milliseconds,
            // subject to the precision and accuracy of system timers and schedulers.
            // The thread does not lose ownership of any monitors.
            Thread.sleep(500);
        } catch (InterruptedException ie) {
        }
        System.out.println(str2);
    }
}
