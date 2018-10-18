package docgenerator;

import RequestUtil.ReadFileUtil;
import RequestUtil.RequestUtilities;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.net.URL;
import java.util.Properties;

public class EmailGenerator {

    private String username = "projecttrainv1@gmail.com";
    private String password = "123train";
    public void sendMail(){

        String[] usAndPw = ReadFileUtil.readFile("src/main/resources/emailStuff.txt").split(System.getProperty("line.separator"));
        String usernameFromFile = usAndPw[0].replace("smtp=", "");
        String passwordFromFile = usAndPw[1].replace("smtp=","");
        if (username.isEmpty() || password.isEmpty()){
            username = usernameFromFile;
            password = passwordFromFile;
        }
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");

        try{
            Session session = Session.getInstance(prop, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            //Will remove hardcoded address list, read from .txt or pass in later on.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("pnoysilly@gmail.com, jyding@asu.edu, aaron.sun@srers.com"));
            message.setSubject("Sent from Project Train");
            message.setText("Hello I'm here to steal your job");
            Transport.send(message);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
