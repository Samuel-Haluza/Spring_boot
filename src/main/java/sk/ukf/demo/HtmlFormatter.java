package sk.ukf.demo;

import org.springframework.stereotype.Component;

@Component("htmlFormatter")
public class HtmlFormatter implements MessageFormatter {

    @Override
    public String format(String message) {
        return "<html><body><h2>" + message + "</h2></body></html>";
    }
}
