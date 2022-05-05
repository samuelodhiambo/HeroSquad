package com.moringaschool;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private Integer age;
    private String specialPower;
    private String weakness;
    private Squad squad;
    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, int age, String specialPower, String weakness, Squad squad) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        this.squad = squad;
        this.instances.add(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public String getWeakness() {
        return weakness;
    }

    public Squad getSquad() {
        return squad;
    }

    public static ArrayList<Hero> getInstances() {
        return instances;
    }
}
