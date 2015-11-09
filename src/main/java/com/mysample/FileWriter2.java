package com.mysample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by QuentinTsai on 09/11/15.
 */

@Component
public class FileWriter2 implements LogWriter{
    public void write(String text) {
        System.out.println("File Writer2 " + text);
    }
}
