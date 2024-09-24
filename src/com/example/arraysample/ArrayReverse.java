package com.example.arraysample;

public class ArrayReverse {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] numbers = {1, 2, 3, 4, 5};

        // 배열을 뒤집기 위한 새로운 배열 생성
        int[] reversedNumbers = new int[numbers.length];

        // 배열의 요소를 역순으로 저장
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - 1 - i];
        }

        // 역순으로 된 배열 출력
        System.out.println("Reversed array:");
        for (int number : reversedNumbers) {
            System.out.println(number);
        }
    }
}
