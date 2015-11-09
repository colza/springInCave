package com.mysample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by QuentinTsai on 06/11/15.
 */

@Component("myperson123")
public class Person {
    private int id;
    private String name;
    private int taxId;
    private Address address;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    public static Person getInstance(int id, String name){
        System.out.println("Factory");
        Person person = new Person(id, name);
        return person;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Inject
    public void setTaxId(@Value(value = "123")int taxId) {
        this.taxId = taxId;
    }

    public void speak(){
        System.out.println("Speak!");
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                '}';
    }
}
