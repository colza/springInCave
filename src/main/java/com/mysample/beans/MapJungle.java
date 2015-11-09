package com.mysample.beans;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by QuentinTsai on 09/11/15.
 */
public class MapJungle {
    private Map<String, String> foods = new HashMap<String, String>();

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "MapJungle{" +
                "foods=" + foods +
                '}';
    }
}
