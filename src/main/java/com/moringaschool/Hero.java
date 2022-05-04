package com.moringaschool;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private Integer age;
    private String specialPower;
    private String weakness;
    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, int age, String specialPower, String weakness) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        instances.add(this);
    }

    public static ArrayList<Hero> getAll() {
        return instances;
    }
}
