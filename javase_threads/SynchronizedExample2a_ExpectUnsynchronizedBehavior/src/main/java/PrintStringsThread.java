
public class PrintStringsThread implements Runnable {
    
    Thread thread;
    String str1, str2;

    // Each thread has its own object instance as a lock
    TwoStrings two = new TwoStrings();
    
    PrintStringsThread(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        thread = new Thread(this);
        thread.start();
    }
    
    public void run() {
        two.print(str1, str2);
    }
    
}
