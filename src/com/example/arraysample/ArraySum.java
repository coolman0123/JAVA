package com.example.arraysample;

public class ArraySum {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] numbers = {1, 2, 3, 4, 5};

        // 배열 요소의 합을 계산
        int sum = 0;
        for (int number : numbers) {
            sum += number; // 각 요소를 더함
        }

        // 합계 출력
        System.out.println("Sum of array elements: " + sum);
    }
}
