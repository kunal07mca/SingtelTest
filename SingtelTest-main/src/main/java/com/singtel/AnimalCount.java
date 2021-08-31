package com.singtel;

import com.singtel.behavior.Flyable;
import com.singtel.behavior.Singable;
import com.singtel.behavior.Swimmable;
import com.singtel.behavior.Walkable;
import com.singtel.model.*;

public class AnimalCount {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(new Dog()),
                new Dog(),
                new Cat(),
                new Fish(),
                new Dolphin(),
                new Shark(),
                new ClownFish(),
                new Butterfly()
        };

        int flyables = 0, walkables = 0, singables = 0, swimmables= 0;
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                flyables++;
            }
            if (animal instanceof Walkable) {
                walkables++;
            }
            if (animal instanceof Singable) {
                singables++;
            }
            if (animal instanceof Swimmable) {
                swimmables++;
            }
        }

        System.out.println(String.format("Total of %n%d animals, " +
                " %n%d can walk, %n%d can fly, %n%d can swim, %n%d can sing", animals.length,
                walkables, flyables, swimmables, singables));
    }
}