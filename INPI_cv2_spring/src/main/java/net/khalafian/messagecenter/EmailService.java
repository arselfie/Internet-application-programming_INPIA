package net.khalafian.messagecenter;

import net.khalafian.MessageSender;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EmailService implements MessageSender {

    public EmailService() {
    }

    public void sendMessage(String message, String recipient) {
        System.out.println("Senidng Email  " + message + " to " + recipient);
    }

    @PostConstruct
    public void loadCache() {
        System.out.println("Loading cache");
    }
}
