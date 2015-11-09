package com.mysample;

/**
 * Created by QuentinTsai on 06/11/15.
 */
public class Address {
    private String street;
    private String postcode;
    public Address(){

    }

    public Address(String postcode, String street) {
        this.postcode = postcode;
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postcode='" + postcode + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
