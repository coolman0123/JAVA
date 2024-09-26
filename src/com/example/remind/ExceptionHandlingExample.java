package com.example.remind;

// 파일명: ExceptionHandlingExample.java
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("숫자를 입력하세요: ");
            int number = scanner.nextInt();
            System.out.println("입력한 숫자: " + number);
        } catch (Exception e) {
            System.out.println("유효하지 않은 입력입니다. 숫자를 입력해야 합니다.");
        } finally {
            scanner.close();
        }
    }
}
