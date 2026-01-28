
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileAndAPIDemo {

    public static void main(String[] args) {

        String filePath = "data.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Java File Handling Example");
            writer.newLine();
            writer.write("Learning secure I/O operations");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("File write error: " + e.getMessage());
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\nReading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
        }


        try {
            URL url = new URL("https://api.github.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            int statusCode = conn.getResponseCode();
            System.out.println("\nAPI Response Code: " + statusCode);

            try (BufferedReader apiReader =
                         new BufferedReader(new InputStreamReader(conn.getInputStream()))) {

                String input;
                System.out.println("\nAPI Response:");
                while ((input = apiReader.readLine()) != null) {
                    System.out.println(input);
                }
            }

            conn.disconnect();

        } catch (Exception e) {
            System.out.println("API Error: " + e.getMessage());
        }
    }
}
