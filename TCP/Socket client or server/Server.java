package com.ClientandServer;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        System.out.println("--- Server Console ---");
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Waiting for a client to connect...");
            
            try (Socket clientSocket = serverSocket.accept();
                 BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                 PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                 BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Client connected: " + clientSocket.getInetAddress());

                String clientMsg, serverResponse;
                // 1-to-1 Chat Loop
                while ((clientMsg = in.readLine()) != null) {
                    if (clientMsg.equalsIgnoreCase("exit")) break;
                    
                    System.out.println("Client: " + clientMsg);
                    
                    // Server response
                    System.out.print("Reply to Client: ");
                    serverResponse = serverInput.readLine();
                    out.println(serverResponse);
                }
            }
            System.out.println("Client disconnected. Server shutting down.");
        } catch (IOException e) {
            System.err.println("Server Error: " + e.getMessage());
        }
    }
}