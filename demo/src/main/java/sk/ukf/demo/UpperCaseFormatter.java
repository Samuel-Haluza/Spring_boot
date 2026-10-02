package sk.ukf.demo;

import org.springframework.stereotype.Component;

@Component("upperCaseFormatter")
public class UpperCaseFormatter implements MessageFormatter {

    @Override
    public String format(String message) {
        return message.toUpperCase();
    }
}
