package com.TemplateMailSender;

import freemarker.template.*;
import jakarta.mail.*; 
import jakarta.mail.internet.*;
import java.io.StringWriter;
import java.util.*;


//    freemarker depedency
public class TemplateEmailSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String to = "aswin201@example.com";
        String from = "aswin.c2401@gmail.com";
        String host = "smtp.gmail.com";
        
        String appPassword = "hwka rgvk svdo lmkd";
//        hwka rgvk svdo lmkd
        
     // SMTP properties 
        Properties props = new Properties(); 
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587"); 
        props.put("mail.smtp.auth", "true"); 
        props.put("mail.smtp.starttls.enable", "true"); 
        
        
        // Authentication 
        Session session = Session.getInstance(props, new Authenticator() {
        	protected PasswordAuthentication getPasswordAuthentication() {
        		return new PasswordAuthentication(from, appPassword); } 
        	});
        
        try { 
        	// Configure FreeMarker 
        	Configuration cfg = new Configuration(Configuration.VERSION_2_3_32); 
        	cfg.setClassLoaderForTemplateLoading(Thread.currentThread().getContextClassLoader(), "templates" );
        	cfg.setDefaultEncoding("UTF-8");
        	
        	// Data model
        	Map<String, Object> data = new HashMap<>();
        	data.put("name", "Aswin"); 
        	data.put("platform", "MyApp");
        	data.put("code", "123456");
        	
        	// Load template 
        	Template template = cfg.getTemplate("welcome.ftl"); 
        	
        	// Merge template with data 
        	StringWriter out = new StringWriter(); 
        	template.process(data, out); 
        	String emailBody = out.toString(); 
        	
        	
        	// Compose message 
        	MimeMessage message = new MimeMessage(session);
        	message.setFrom(new InternetAddress(from));
        	message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        	message.setSubject("Welcome to MyApp"); 
        	message.setContent(emailBody, "text/html"); 
        	
        	// Send
        	Transport.send(message); 
        	System.out.println("Template-based email sent successfully!");
        	
        	
        }catch(Exception e) {
        	System.err.println("Error "+e.getMessage());
        }
	}

}
