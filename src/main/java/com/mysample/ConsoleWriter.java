package com.mysample;

import org.springframework.stereotype.Component;

/**
 * Created by QuentinTsai on 09/11/15.
 */

@Component("c1")
public class ConsoleWriter implements LogWriter{
    private String contentText;

    public ConsoleWriter() {
    }

    public ConsoleWriter(String contentText) {
        this.contentText = contentText;
    }

    public void write(String text) {
        System.out.println("ConsoleWriter: " + contentText);
    }
}
