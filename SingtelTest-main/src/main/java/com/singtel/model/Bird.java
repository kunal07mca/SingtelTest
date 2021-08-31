package com.singtel.model;

import com.singtel.behavior.Singable;
import com.singtel.behavior.Walkable;
import com.singtel.util.Constant;
import com.singtel.util.SoundEnum;

public class Bird extends Animal implements Walkable, Singable {

    @Override
    public void sing() {
        System.out.println(SoundEnum.DEFAULT.getSound());
    }

    @Override
    public void walk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
