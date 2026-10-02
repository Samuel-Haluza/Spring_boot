package sk.ukf.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("emailNotification")
public class EmailNotification implements NotificationService {

    private final MessageFormatter messageFormatter;

    public EmailNotification(@Qualifier("htmlFormatter") MessageFormatter messageFormatter) {
        this.messageFormatter = messageFormatter;
    }

    @Override
    public String send(String message) {
        String formattedMessage = messageFormatter.format(message);
        return "Posielam notifikáciu e-mailom: " + formattedMessage;
    }

}