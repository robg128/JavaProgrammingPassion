import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {

        ProcessBuilder processBuilder = new ProcessBuilder("javap", "-private",
                "java.lang.String");

        // The options for manipulating the environment include adding environment
        // variables with the put() method, and removing them with the remove()
        // method.
        Map<String, String> environment = processBuilder.environment();

        environment.put("path", ";"); // Clearing the path variable;
        environment.put("path", "C:\\Java\\jdk1.7.0_25\\bin;");

        // If you want the process to start in a different directory, you don't
        // pass a File in as a command line argument. Instead, you set the process
        // processBuilder's working directory by passing the File to the directory()
        // method. (This does not have any impact to the result of this
        // example code.)
        processBuilder.directory(new File("/tmp"));

        // With ProcessBuilder, you call start() to execute the command. Prior
        // to calling start(), you can manipulate how the Process will be created.
        Process process = processBuilder.start();
        writeProcessOutput(process);
    }

    // Get the output from the subprocess and then display.
    static void writeProcessOutput(Process process) throws Exception {
        // "process.getInputStream()" gets the input stream of the subprocess.
        // The stream obtains data piped from the standard output stream of the
        // process represented by this Process object.
        InputStreamReader tempReader = new InputStreamReader(
                new BufferedInputStream(process.getInputStream()));
        BufferedReader reader = new BufferedReader(tempReader);
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
    }
}
