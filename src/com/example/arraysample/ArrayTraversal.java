package com.example.arraysample;

public class ArrayTraversal {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] numbers = {10, 20, 30, 40, 50};

        // 배열을 순회하여 각 요소를 출력
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
