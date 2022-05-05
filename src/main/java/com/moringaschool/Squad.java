package com.moringaschool;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Squad {
    private int maxSize;
    private String name;
    private String[] course = {"gender equity", "Evil", "Bullying"};
    private String fightCourse;
    public static ArrayList<Squad> instances = new ArrayList<>();

    public Squad(int maxSize, String name, int course){
        this.maxSize = maxSize;
        this.name = name;
        this.fightCourse = this.course[course];
        this.instances.add(this);
    }

    public static ArrayList<Squad> getAll() {
        return instances;
    }

    public String getName() {
        return name;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public String getFightCourse() {
        return fightCourse;
    }
}
