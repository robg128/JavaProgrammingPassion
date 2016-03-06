public class DisplayAllThreads {
    
    public static void main(String[] args) {
        
        // Start three threads first.  They should belong
        // to a same ThreadsGroup.
        new SimpleThread("Boston").start();
        new SimpleThread("New York").start();
        new SimpleThread("Seoul").start();
        
        Thread[] tarray = findAllThreads();
        
        for (int i=0; i<tarray.length;i++){
            System.out.println("Thread " + tarray[i].getName()
            + " in thread group " + tarray[i].getThreadGroup().getName());
        }
        
    }
    
    // Create an array of all threads in the system.
    public static Thread[] findAllThreads() {
        ThreadGroup topGroup = null;
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        
        while (group != null) {
            topGroup = group;
            group = group.getParent();
        }
        
        int estimatedSize = topGroup.activeCount() * 2;
        Thread[] slackList = new Thread[estimatedSize];
        
        int actualSize = topGroup.enumerate(slackList);
        
        Thread[] list = new Thread[actualSize];
        System.arraycopy(slackList, // source
                0,                  // source position
                list,               // destination
                0,                  // destination position
                actualSize);        // length
        
        return list;
    }
}
