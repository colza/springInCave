package com.mysample;

import org.springframework.stereotype.Component;

/**
 * Created by QuentinTsai on 09/11/15.
 */

@Component("f1")
public class FileWriter implements LogWriter{

    public FileWriter() {
    }

    public void write(String text) {
        System.out.println("FileWriter: " + text);
    }
}
