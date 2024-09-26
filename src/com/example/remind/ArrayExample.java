package com.example.remind;

// 파일명: ArrayExample.java
public class ArrayExample {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] numbers = {1, 2, 3, 4, 5};

        // 배열의 각 요소 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // 배열 요소의 합 계산
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("배열의 합: " + sum);
    }
}
