package com.company;

import Class.Animal;
import Class.Cat;
import Class.Dog;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.setSleep(false);
        //cat.setEat(true);
        System.out.println(cat.Voice());

        dog.setSleep(true);
        dog.setEat(false);
        System.out.println(dog.Voice());


    }
}
