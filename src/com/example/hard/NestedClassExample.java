package com.example.hard;

public class NestedClassExample {
    public static void main(String[] args) {
        // 외부 클래스 생성
        Outer outer = new Outer();

        // 외부 클래스의 내부 클래스 객체 생성
        Outer.Inner inner = outer.new Inner();
        inner.show();  // 출력: 내부 클래스
    }
}

// 외부 클래스
class Outer {
    // 내부 클래스
    class Inner {
        void show() {
            System.out.println("내부 클래스");
        }
    }
}
