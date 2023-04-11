import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999); 
            System.out.println("Server is running and waiting for client...");

            
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket);

                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String radiusString = in.readLine();
                double radius = Double.parseDouble(radiusString);

                double area = Math.PI * radius * radius;

                out.println("Area of circle with radius " + radius + " is: " + area);

                // Close the streams and client socket
                in.close();
                out.close();
                clientSocket.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
