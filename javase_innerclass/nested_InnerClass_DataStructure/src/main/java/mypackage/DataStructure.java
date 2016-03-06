package mypackage;

public class DataStructure {

    // create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        //fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {
        //print out values of even indices of the array
        InnerEvenIterator iterator = this.new InnerEvenIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext() + " ");
        }
    }

    // inner class implements the Iterator pattern
    private class InnerEvenIterator {

        //start stepping through the array from the beginning
        private int next = 0;

        public boolean hasNext() {
            //check if a current element is the last in the array
           return (next <= SIZE - 1); // Observe that the inner class can access
                                      // the private member of the outer class, SIZE
        }

        public int getNext() {
            /// Note that the InnerEvenIterator class refers directly
            /// to the arrayOfInts instance variable of the DataStructure
            /// object.
            int retValue = arrayOfInts[next];
            //get the next even element
            next += 2;
            return retValue;
        }
    }

    // main method
    public static void main(String s[]) {
        //fill the array with integer values and print out only values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
