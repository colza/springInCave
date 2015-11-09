package com.mysample.beans;

import com.mysample.Person;

/**
 * Created by QuentinTsai on 09/11/15.
 */
public class PersonFactory {
    public Person createPerson(int id, String name){
        System.out.println("Using Factory to create person");
        return new Person(id, name);
    }
}
