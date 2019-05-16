package com.example.humanoop;

import android.util.Log;

public class Human {
    private String name;
    private int age;
    public int weight;


    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void eat() {
        Log.d("human", "I am eating food");
    }


    public void sleep() {
        Log.d("human", "zzzzzzz");
    }

    public void sleep(int hours) {
        Log.d("human", "i am sleeping for " + hours+ "hours");
    }

    public void speak(String speech) {
        Log.d("human", speech);
    }

    public int birthday() {
        age=age+1;
        return age;
    }


}