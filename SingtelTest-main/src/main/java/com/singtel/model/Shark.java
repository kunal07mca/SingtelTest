package com.singtel.model;


import com.singtel.util.Constant;

public class Shark extends Fish {

    public Shark() {
        size = Constant.Size.LARGE;
        color = Constant.Color.GREY;
    }
    public void eat() {
        System.out.println(Constant.SHARK_CAN_EAT);
    }
}

