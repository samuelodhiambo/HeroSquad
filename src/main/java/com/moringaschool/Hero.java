package com.moringaschool;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private Integer age;
    private String specialPower;
    private String weakness;
    private static List<Hero> instances = new ArrayList<Hero>();

    public Hero(String name, int age, String specialPower, String weakness) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        instances.add(this);
    }

    public static List<Hero> getAll() {
        return instances;
    }
}
