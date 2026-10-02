package sk.ukf.demo;

import org.springframework.stereotype.Component;

@Component("plainTextFormatter")
public class PlainTextFormatter implements MessageFormatter {

    @Override
    public String format(String message) {
        return message;
    }
}
