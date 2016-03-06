/* SERVER – may enhance to work for multiple clients */
import java.net.*;
import java.io.*;

public class NetworkingServer {

    public static void main(String [] args) {

        ServerSocket serverSocket = null;
        Socket socket;

        // Default port number we are going to use
        int portnumber = 1234;
        if (args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }

        // Create Server side socket that waits for connection request
        try {
            serverSocket = new ServerSocket(portnumber);
        } catch (IOException ie) {
            System.out.println("Cannot open socket." + ie);
            System.exit(1);
        }
        System.out.println("ServerSocket is created " + serverSocket);

        // Wait for the data from the socket and reply
        while(true) {

            try {

                // Listens for a connection to be made to
                // this socket and accepts it. The method blocks until
                // a connection is made
                System.out.println("Waiting for connect request...");
                socket = serverSocket.accept();

                System.out.println("Connect request is accepted...");
                String host = socket.getInetAddress().getHostAddress();
                int port = socket.getPort();
                System.out.println("Client host = " + host + " Client port = " + port);

                // Read data from the socket
                InputStream clientIn = socket.getInputStream();
                BufferedReader br = new BufferedReader(new
                        InputStreamReader(clientIn));
                String msgFromClient = br.readLine();
                System.out.println("Message received from client = " + msgFromClient);

                // Send response to the socket
                if (msgFromClient != null && !msgFromClient.equalsIgnoreCase("bye")) {
                    OutputStream clientOut = socket.getOutputStream();
                    PrintWriter pw = new PrintWriter(clientOut, true);
                    String ansMsg = "Hello, " + msgFromClient;
                    pw.println(ansMsg);
                }

                // Close sockets
                if (msgFromClient != null && msgFromClient.equalsIgnoreCase("bye")) {
                    serverSocket.close();
                    socket.close();
                    break;
                }

            } catch (IOException ie) {
            }
        }
    }
}
