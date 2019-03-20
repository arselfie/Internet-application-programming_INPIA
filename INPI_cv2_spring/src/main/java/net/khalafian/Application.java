package net.khalafian;

import net.khalafian.messagecenter.EmailService;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class Application {

    @Autowired
    List<MessageSender> senders;


    public Application() {
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("net.khalafian");
        Application application = context.getBean(Application.class);
        application.processMessages("Hello", "Pavel");


    }

    public void processMessages(String msg, String recipient) {
        if (Objects.isNull(msg) || Objects.isNull(recipient)) {
            throw new IllegalArgumentException();
        }

        for (MessageSender sender : senders) {
            sender.sendMessage(msg, recipient);

        }


    }

}
