package com.example.sample;

class Car {
    String model;
    String color;
    int year;

    void displayInfo() {
        System.out.println("Model: " + model + ", Color: " + color + ", Year: " + year);
    }
}

public class Object {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Tesla Model 3";
        car1.color = "Red";
        car1.year = 2023;
        car1.displayInfo();
    }
}
