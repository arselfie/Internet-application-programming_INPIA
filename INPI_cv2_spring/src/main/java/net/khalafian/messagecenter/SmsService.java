package net.khalafian.messagecenter;

import net.khalafian.MessageSender;

public class SmsService implements MessageSender {

    public void sendMessage(String message, String recipient) {
        System.out.println("Senidng SMS  " + message + " to " + recipient);
    }
}
