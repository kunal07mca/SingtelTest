package com.singtel.model;

import com.singtel.behavior.Swimmable;
import com.singtel.util.Constant;

public class Dolphin extends Animal implements Swimmable {

    @Override
    public void swim() {
        System.out.println(Constant.DOLPHIN_IS_SWIMMING);
    }
}