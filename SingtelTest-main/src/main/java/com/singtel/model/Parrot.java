package com.singtel.model;

import com.singtel.behavior.Flyable;
import com.singtel.behavior.Singable;
import com.singtel.util.Constant;

public class Parrot extends Bird implements Flyable {
    Singable neighborSound;

    public Parrot(Singable neighborSound) {
        this.neighborSound = neighborSound;
    }

    @Override
    public void sing() {
        if (null != neighborSound) {
            neighborSound.sing();
        }
    }

    @Override
    public void fly() {
        System.out.println(Constant.I_AM_FLYING);
    }
}

