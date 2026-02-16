package com.ClientandServer;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("--- Client Console ---");
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to the server. Type 'exit' to quit.");
            
            String message, response;
            while (true) {
                System.out.print("You (Client): ");
                message = userIn.readLine();
                
                if (message == null || message.equalsIgnoreCase("exit")) {
                    out.println("exit");
                    break;
                }

                out.println(message); // Send to server
                
                // Wait for the server's specific 1-to-1 reply
                response = in.readLine();
                if (response == null) break;
                System.out.println("Server says: " + response);
            }
        } catch (IOException e) {
            System.err.println("Connection Error: " + e.getMessage());
        }
    }
}