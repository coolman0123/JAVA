package com.example.remind;

// 파일명: OOPExample.java
class Car {
    String model;
    int year;

    // 생성자
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // 메소드
    public void printCarInfo() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}

public class OOPExample {
    public static void main(String[] args) {
        // 객체 생성
        Car car1 = new Car("Tesla", 2020);
        Car car2 = new Car("BMW", 2021);

        // 메소드 호출
        car1.printCarInfo();
        car2.printCarInfo();
    }
}
