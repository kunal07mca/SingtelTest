package com.singtel.model;

import com.singtel.util.SoundEnum;

public class Chicken extends Bird {

    @Override
    public void sing() {
        System.out.println(SoundEnum.CHICKEN.getSound());
    }
}
