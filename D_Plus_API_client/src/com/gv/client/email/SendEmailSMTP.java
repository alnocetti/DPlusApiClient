package com.gv.client.email;
	
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.sun.mail.smtp.SMTPTransport;

	public class SendEmailSMTP {	
			
	    private String SMTP_SERVER = "";
	    private String USERNAME = "";
	    private String PASSWORD = "";
	    private String EMAIL_FROM = "";
	    private String EMAIL_TO = "";
	    private String EMAIL_TO_CC = ""; 

	    private String EMAIL_SUBJECT = "";
	    private String EMAIL_TEXT = "";

	    
		public SendEmailSMTP() {
			super();
			try {
				initialize();
			} catch (ParserConfigurationException | SAXException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void initialize() throws ParserConfigurationException, SAXException, IOException {
			
			// for example, smtp.mailgun.org
			File fXmlFile = new File("Configuration.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			
			this.SMTP_SERVER = doc.getElementsByTagName("SMTP_SERVER").item(0).getTextContent();
			this.EMAIL_FROM = doc.getElementsByTagName("EMAIL_FROM").item(0).getTextContent();
			this.USERNAME = doc.getElementsByTagName("USERNAME").item(0).getTextContent();
			this.PASSWORD = doc.getElementsByTagName("PASSWORD").item(0).getTextContent();
			this.EMAIL_TO = doc.getElementsByTagName("EMAIL_TO").item(0).getTextContent();
		}



		public SendEmailSMTP(String sMTP_SERVER, String uSERNAME, String eMAIL_FROM, String eMAIL_TO,
				String eMAIL_TO_CC, String eMAIL_SUBJECT, String eMAIL_TEXT) {
			super();
			SMTP_SERVER = sMTP_SERVER;
			USERNAME = uSERNAME;
			EMAIL_FROM = eMAIL_FROM;
			EMAIL_TO = eMAIL_TO;
			EMAIL_TO_CC = eMAIL_TO_CC;
			EMAIL_SUBJECT = eMAIL_SUBJECT;
			EMAIL_TEXT = eMAIL_TEXT;
		}



		public void sendEmail() {

	        Properties prop = System.getProperties();
	        prop.put("mail.smtp.host", SMTP_SERVER); //optional, defined in SMTPTransport
	        prop.put("mail.smtp.auth", "true");
	        prop.put("mail.smtp.port", "25"); // default port 25

	        Session session = Session.getInstance(prop, null);
	        Message msg = new MimeMessage(session);

	        try {
			
				// from
	            msg.setFrom(new InternetAddress(EMAIL_FROM));

				// to 
	            msg.setRecipients(Message.RecipientType.TO,
	                    InternetAddress.parse(EMAIL_TO, false));

				// cc
	            msg.setRecipients(Message.RecipientType.CC,
	                    InternetAddress.parse(EMAIL_TO_CC, false));

				// subject
	            msg.setSubject(EMAIL_SUBJECT);
				
				// content 
	            msg.setText(EMAIL_TEXT);
				
	            msg.setSentDate(new Date());

				// Get SMTPTransport
	            SMTPTransport t = (SMTPTransport) session.getTransport("smtp");
				
				// connect
	            t.connect(SMTP_SERVER, USERNAME, PASSWORD);
				
				// send
	            t.sendMessage(msg, msg.getAllRecipients());

	            System.out.println("Response: " + t.getLastServerResponse());

	            t.close();

	        } catch (MessagingException e) {
	            e.printStackTrace();
	        }


	    }
		
	    public String getSMTP_SERVER() {
			return SMTP_SERVER;
		}



		public void setSMTP_SERVER(String sMTP_SERVER) {
			SMTP_SERVER = sMTP_SERVER;
		}



		public String getUSERNAME() {
			return USERNAME;
		}



		public void setUSERNAME(String uSERNAME) {
			USERNAME = uSERNAME;
		}



		public String getEMAIL_FROM() {
			return EMAIL_FROM;
		}



		public void setEMAIL_FROM(String eMAIL_FROM) {
			EMAIL_FROM = eMAIL_FROM;
		}



		public String getEMAIL_TO() {
			return EMAIL_TO;
		}



		public void setEMAIL_TO(String eMAIL_TO) {
			EMAIL_TO = eMAIL_TO;
		}



		public String getEMAIL_TO_CC() {
			return EMAIL_TO_CC;
		}



		public void setEMAIL_TO_CC(String eMAIL_TO_CC) {
			EMAIL_TO_CC = eMAIL_TO_CC;
		}



		public String getEMAIL_SUBJECT() {
			return EMAIL_SUBJECT;
		}



		public void setEMAIL_SUBJECT(String eMAIL_SUBJECT) {
			EMAIL_SUBJECT = eMAIL_SUBJECT;
		}



		public String getEMAIL_TEXT() {
			return EMAIL_TEXT;
		}



		public void setEMAIL_TEXT(String eMAIL_TEXT) {
			EMAIL_TEXT = eMAIL_TEXT;
		}



		public String getPassword() {
			return PASSWORD;
		}

		
	}


