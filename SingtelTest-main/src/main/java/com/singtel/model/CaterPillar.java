package com.singtel.model;


import com.singtel.behavior.Walkable;
import com.singtel.util.Constant;

public class CaterPillar extends Animal implements Walkable {

    @Override
    public void walk() {
        System.out.println(Constant.CATERPILLAR_IS_CRAWLING);
    }

    public Butterfly grow() {
        return new Butterfly();
    }
}