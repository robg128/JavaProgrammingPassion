
// Unsynchronized CubbyHole.
//
// Results are unpredictable; a number may be read before a number has 
// been produced or multiple numbers may be produced with only one or 
// two being read.

public class CubbyHole {
    private int contents;
    private boolean available = false;

    public int get() {
        available = false;
        return contents;
    }

    public void put(int value) {
        contents = value;
        available = true;
    }
}