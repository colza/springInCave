package com.mysample;

/**
 * Created by QuentinTsai on 09/11/15.
 */
public class Offer {

    private int id;
    private String namel;
            private String email;
    private String text;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamel() {
        return namel;
    }

    public void setNamel(String namel) {
        this.namel = namel;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", namel='" + namel + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
