package com.singtel.model;


import com.singtel.util.Constant;

public class ClownFish extends Fish {
    public ClownFish() {
        size = Constant.Size.SMALL;
        color = Constant.Color.ORANGE;
    }

    public void joke() {
        System.out.println(Constant.CLOWNFISH_CAN_JOKE);
    }
}