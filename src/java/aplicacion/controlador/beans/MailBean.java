/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.modelo.dominio.Usuario;
import java.util.Properties;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.swing.JOptionPane;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Windows
 */
@ManagedBean
@ViewScoped
public class MailBean {
    
    private Usuario usuarioLogueado;
    /**
     * Creates a new instance of MailBean
     */
    public MailBean() {
    }
    
    public void enviarMail() {
        try{
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            
            Session session = Session.getDefaultInstance(props);
    
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("**********m"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("*********"));
            message.setSubject("Mail de prueba");
            message.setText("Su codigo de verificacion es: "+(int)(Math.random()*1000));
            
            Transport t = session.getTransport("smtp");
            t.connect("*******", "********");
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();
            JOptionPane.showMessageDialog(null, "Mensaje enviado.");
            
        }catch(AddressException ex){
            
        }catch(MessagingException ex){
            
        }
    }
}
