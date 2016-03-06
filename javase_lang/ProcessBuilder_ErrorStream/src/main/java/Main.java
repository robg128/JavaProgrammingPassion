import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {

        // Create an error situation when running javap passing an invalid
        // class
        ProcessBuilder processBuilder = new ProcessBuilder("javap", "-private",
                 "java.lang.junkClass");   // This class does not exist

        // The options for manipulating the environment include adding environment
        // variables with the put() method, and removing them with the remove()
        // method.
        Map<String, String> environment = processBuilder.environment();

        environment.put("path", ";"); // Clearing the path variable;
        environment.put("path", "C:\\Java\\jdk1.7.0_25\\bin;");

        // With ProcessBuilder, you call start() to execute the command. Prior
        // to calling start(), you can manipulate how the Process will be created.
        Process process = processBuilder.start();
        writeProcessOutput(process);
        writeProcessError(process);
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

    // Get the error from the subprocess and then display
    static void writeProcessError(Process process) throws Exception {
        System.out.println("----- Start capturoing error through process.getErrorStream() ");
        InputStreamReader tempReader = new InputStreamReader(
                new BufferedInputStream(process.getErrorStream()));
        BufferedReader reader = new BufferedReader(tempReader);
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
        System.out.println("----- Stop capturoing error through process.getErrorStream() ");
    }
}
