package com.singtel.model;

import com.singtel.behavior.Flyable;
import com.singtel.behavior.Swimmable;
import com.singtel.util.Constant;
import com.singtel.util.SoundEnum;

public class Duck extends Bird implements Swimmable, Flyable {
    @Override
    public void fly() {
        System.out.println(Constant.I_AM_FLYING);
    }
    @Override
    public void swim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
    @Override
    public void sing() {
        System.out.println(SoundEnum.DUCK.getSound());
    }
}