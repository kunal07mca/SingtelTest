package com.singtel.util;

public enum SoundEnum {
    CHICKEN("Cluck, cluck"),
    DUCK("Quack, quack"),
    ROOSTER("Cock-a-doodle-doo"),
    DOG("Woof, woof"),
    CAT("Me ow"),
    DEFAULT("I am singing");
    private String sound;

    SoundEnum(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}