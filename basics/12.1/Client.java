import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("\nVEDANT PATEL IU2141230208\n");
        try {
            Socket clientSocket = new Socket("localhost", 9999); 

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the radius of the circle: ");
            String radiusString = reader.readLine();
            double radius = Double.parseDouble(radiusString);

            out.println(radius);

            String result = in.readLine();
            System.out.println(result);
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
