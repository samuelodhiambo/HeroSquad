package com.moringaschool;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private Integer age;
    private String specialPower;
    private String weakness;
    Squad squad;
    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, int age, String specialPower, String weakness, Squad squad) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        this.squad = squad;
        instances.add(this);
    }

    public static ArrayList<Hero> getAll() {
        return instances;
    }
}
