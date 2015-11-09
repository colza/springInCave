package com.mysample;

import com.mysample.beans.FruitBasket;
import com.mysample.beans.MapJungle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by QuentinTsai on 06/11/15.
 */
public class myapp {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/mysample/beans/mybean.xml");
//        Person person = (Person) context.getBean("person");
//        Person person2 = (Person) context.getBean("person2");
////        Person person = new Person();
//        person.speak();
//        person2.speak();
//
//        Address address = (Address) context.getBean("address");
//        Address address2 = (Address) context.getBean("address2");
//
//        System.out.println(address);
//        System.out.println(address2);
//        System.out.println(person);
//        System.out.println(person2);
//
//        FruitBasket fruitBasket = (FruitBasket) context.getBean("fruitBasket");
//        System.out.println(fruitBasket);
//
//        MapJungle mapJungle = (MapJungle)context.getBean("mapJungle");
//        System.out.println(mapJungle);

//        FileWriter fileWriter = (FileWriter) context.getBean("fileWriter");
//        fileWriter.write();
//
//        ConsoleWriter consoleWriter = (ConsoleWriter) context.getBean("consoleWriter");
//        consoleWriter.write();

        Logger logger = (Logger) context.getBean("logger");
        logger.writeConsole("Hello");
        logger.writeFile("File Hi");

        Person person = (Person) context.getBean("person");
        person.speak();
        System.out.println(person);

        FileWriter2 fileWriter2 = (FileWriter2) context.getBean("fileWriter2");
        fileWriter2.write("f2f2f2");

        ((FileSystemXmlApplicationContext) context).close();

    }
}
