
import java.io.*;

public class PipedReaderWriter {

    public static void main(String[] args) throws IOException {

        FileReader words = new FileReader("words.txt");

        // do the reversing and sorting
        Reader rhymedWords = reverse(sort(reverse(words)));

        // write new list to standard out
        BufferedReader in = new BufferedReader(rhymedWords);
        String input;

        while ((input = in.readLine()) != null) {
            System.out.println(input);
        }
        in.close();
    }

    public static Reader reverse(Reader source) throws IOException {

        // A piped input stream should be connected to a piped output stream;
        // the piped input stream then provides whatever data bytes are written
        // to the piped output stream.
        PipedWriter pipeOut = new PipedWriter();
        PipedReader pipeIn = new PipedReader(pipeOut);

        // Provide the data source
        BufferedReader in = new BufferedReader(source);
        // Create PrinterWriter from the PipedWriter
        PrintWriter out = new PrintWriter(pipeOut);

        // Start a new thread that reads data and then write it out
        // to the PrintWriter
        new ReverseThread(out, in).start();

        // Return Reader object
        return pipeIn;
    }

    public static Reader sort(Reader source) throws IOException {

        PipedWriter pipeOut = new PipedWriter();
        PipedReader pipeIn = new PipedReader(pipeOut);

        PrintWriter out = new PrintWriter(pipeOut);
        BufferedReader in = new BufferedReader(source);

        new SortThread(out, in).start();

        return pipeIn;
    }
}
