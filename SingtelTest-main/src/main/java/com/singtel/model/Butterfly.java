package com.singtel.model;

import com.singtel.behavior.Flyable;
import com.singtel.util.Constant;

public class Butterfly extends Animal implements Flyable {

    @Override
    public void fly() {
        System.out.println(Constant.BUTTERFLY_IS_FLYING);
    }
}