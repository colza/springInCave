package com.mysample.beans;

import java.util.List;

/**
 * Created by QuentinTsai on 09/11/15.
 */
public class FruitBasket {
    private String name;
    private List<String> list;

    public FruitBasket(String name, List<String> list) {
        this.name= name;
        this.list = list;
    }


    @Override
    public String toString() {
        return "FruitBasket{" +
                "list=" + list +
                ", name='" + name + '\'' +
                '}';
    }
}
