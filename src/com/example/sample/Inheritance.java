package com.example.sample;

class Animal {
    void sound() {
        System.out.println("This animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}
