package com.example.lotto;

public class Ball {
    //로또 번호가 영원히 바뀌면 안됨
    private int number;
    //불변객체
    public Ball(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
