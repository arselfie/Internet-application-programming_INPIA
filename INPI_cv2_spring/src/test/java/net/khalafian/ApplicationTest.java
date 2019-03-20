package net.khalafian;

import net.khalafian.messagecenter.EmailService;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {

    @Mock
    private Application testApplication;


    @org.junit.Test(expected = IllegalArgumentException.class)
    public void processMessagesMsgIsEmpty() {
        Application testApplication = new Application();

        testApplication.processMessages(null, "Pavel");

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void processMessagesRecipientIsEmpty() {
        Application testApplication = new Application();

        testApplication.processMessages("Hello", null);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void processMessagesMsgAndRecipientAreEmpty() {
        Application testApplication = new Application();

        testApplication.processMessages(null, null);

    }



    private class EmailSenderMock extends EmailService{
        int callCount=0;

        @Override
        public void sendMessage(String message, String recipient) {
            callCount++;
        }
    }

}