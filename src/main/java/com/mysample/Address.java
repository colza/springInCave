package com.mysample;

/**
 * Created by QuentinTsai on 06/11/15.
 */
public class Address {
    private String street;
    private String postcode;

    public Address(String postcode, String street) {
        this.postcode = postcode;
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
