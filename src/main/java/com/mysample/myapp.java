package com.mysample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by QuentinTsai on 06/11/15.
 */
public class myapp {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/mysample/beans/mybean.xml");
        Person person = (Person) context.getBean("person");
//        Person person = new Person();
        person.speak();

        Address address = (Address) context.getBean("address");

        System.out.println(address);
        System.out.println(person);
    }
}
