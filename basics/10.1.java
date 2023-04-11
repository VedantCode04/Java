import java.io.*;

public class main {
    public static void main(String[] args) {
    	System.out.println("\nVEDANT PATEL IU2141230208\n");
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <source_file> <destination_file>");
            System.exit(1);
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            System.out.println("File copied successfully using character stream.");
        } catch (IOException e) {
            System.err.println("Error copying file using character stream: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully using byte stream.");
        } catch (IOException e) {
            System.err.println("Error copying file using byte stream: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully using buffered stream.");
        } catch (IOException e) {
            System.err.println("Error copying file using buffered stream: " + e.getMessage());
        }
    }
}
