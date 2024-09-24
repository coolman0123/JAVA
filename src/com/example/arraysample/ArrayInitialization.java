package com.example.arraysample;

public class ArrayInitialization {
    public static void main(String[] args) {
        // 배열을 선언하고 초기화
        int[] numbers = {1, 2, 3, 4, 5};

        // 배열 요소 출력
        System.out.println("Initialized array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
