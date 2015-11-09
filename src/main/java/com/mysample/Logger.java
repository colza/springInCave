package com.mysample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by QuentinTsai on 09/11/15.
 */

@Component
public class Logger {


    private ConsoleWriter consoleWriter;

    private LogWriter fileWriter;

    public ConsoleWriter getConsoleWriter() {
        return consoleWriter;
    }

    @Inject
    @Named(value = "c1")
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public LogWriter getFileWriter() {
        return fileWriter;
    }

    @Inject
    @Named(value = "f1")
    public void setFileWriter(LogWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text){
        fileWriter.write(text);
    }

    public void writeConsole(String text){
        consoleWriter.write(text);
    }

    @PostConstruct
    public void init(){
        System.out.println("init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
}
