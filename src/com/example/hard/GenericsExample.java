package com.example.hard;

import java.util.*;

public class GenericsExample {
    public static void main(String[] args) {
        // List에 Number의 하위 타입을 허용
        List<? extends Number> list = new ArrayList<>(Arrays.asList(1, 2.5, 3, 4.0));
        System.out.println("합계: " + sum(list));  // 출력: 합계: 10.5
    }

    // List에 있는 Number 타입의 모든 요소를 더하는 메소드
    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();  // 각 요소를 double로 변환해 더함
        }
        return sum;
    }
}
