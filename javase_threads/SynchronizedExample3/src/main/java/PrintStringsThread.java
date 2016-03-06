
public class PrintStringsThread implements Runnable {

    Thread thread;
    String str1, str2;
    TwoStrings ts;

    PrintStringsThread(String str1, String str2,
            TwoStrings ts) {
        this.str1 = str1;
        this.str2 = str2;
        this.ts = ts;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        // All the statements specified in the
        // parentheses of the synchronized statement
        // become the synchronized block, and the
        // object specified in the statement is the
        // lock.
        synchronized (ts) {
            ts.print(str1, str2);
        }
    }
}
