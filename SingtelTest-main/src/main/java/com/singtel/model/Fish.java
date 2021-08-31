package com.singtel.model;


import com.singtel.behavior.Swimmable;
import com.singtel.util.Constant;

public class Fish extends Animal implements Swimmable {
    public Constant.Size size;
    public Constant.Color color;

    @Override
    public void swim() {
        System.out.println(Constant.FISH_IS_SWIMMING);
    }
}