package com.example;

public class MyRunnableMain {
    public static void main(String[] args){
        MyRunnable r = new MyRunnable() {
            //인터페이스는 인스턴스를 바로 생성할 수 없기 때문에 이런 식으로 자동 생성
            @Override
            public void run() {

            }
        };
    }
}
