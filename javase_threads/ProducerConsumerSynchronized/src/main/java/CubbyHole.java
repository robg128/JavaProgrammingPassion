public class CubbyHole {

    private int contents;
    private boolean available = false;

    // Wait until there is a number available in the cubbyhole.
    // The "synchronized" forces the thread that executes this
    // method to acquire a lock before proceeding.
    public synchronized int get(int who) {
        while (available == false) {   // Wait as long as there is nothing
            try {
                wait();                 // release the lock
            } catch (InterruptedException e) { }
        }
        // If the control reaches here, the lock must have been acquired again
        available = false;              // Reset the flag again
        System.out.format("Consumer %d got: %d%n", who, contents);

        // Wakes up all threads that are waiting on the lock to be released.
        notifyAll();                   
        return contents;
        // By finishing up this synchronized method, the lock will be
        // released.
    }

    // Wait until the space is free for placing a new number.
    // The "synchronized" forces the thread that executes this
    // method to acquire a lock before proceeding.
    public synchronized void put(int who, int value) {
        while (available == true) { // Wait as long as there is a something already
            try {
                wait();             // release the lock
            } catch (InterruptedException e) { }
        }

        // If the control reaches here, the lock must have been acquired again
        contents = value;
        available = true;
        System.out.format("Producer %d put: %d%n", who, contents);
        notifyAll();
    }
}
