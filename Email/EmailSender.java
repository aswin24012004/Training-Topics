package com.email;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

public class EmailSender {
    public static void main(String[] args) {
        // Recipient and sender
        String to = "aswin2401@example.com";
        String from = "aswin.c2401@gmail.com";
        String host = "smtp.gmail.com";
        
        String pass = "hwka rgvk svdo lmkd";

        // SMTP properties
        Properties properties = new Properties();
        
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");


        // Authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, pass);
            }
        });

        try {
            // Create message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Test Email from Java");
            message.setText("Hello, this is a test email sent from Java!");

            // Send message
            Transport.send(message);
            System.out.println("Email sent successfully!");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
