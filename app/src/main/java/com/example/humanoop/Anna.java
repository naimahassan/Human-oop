package com.example.humanoop;

import android.util.Log;

public class Anna extends Human {

    public int height;


    public Anna(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    @Override
    public void eat() {
//        super.eat();
        Log.d("Anna","i am eating" + (weight+2));
    }

    @Override
    public int birthday() {
        return super.birthday();
    }
}
