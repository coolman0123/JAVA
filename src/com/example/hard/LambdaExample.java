package com.example.hard;

import java.util.function.*;

public class LambdaExample {
    public static void main(String[] args) {
        // 람다 표현식으로 함수형 인터페이스 정의
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("5의 제곱: " + square.apply(5));  // 출력: 5의 제곱: 25

        // 더 복잡한 람다: 두 값을 더함
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("3과 7의 합: " + add.apply(3, 7));  // 출력: 3과 7의 합: 10
    }
}
