package com.mysample;

/**
 * Created by QuentinTsai on 06/11/15.
 */
public class Person {
    private int id;
    private String name;
    private int taxId;
    private Address address;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setTaxId(int taxId) {
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
