package com.example.arraysample;

public class ArrayMax {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] numbers = {12, 3, 7, 8, 9};

        // 배열에서 가장 큰 값을 찾음
        int max = numbers[0]; // 첫 번째 요소를 최대값으로 설정
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // 더 큰 값이 있으면 최대값을 갱신
            }
        }

        // 최대값 출력
        System.out.println("Maximum element in the array: " + max);
    }
}
