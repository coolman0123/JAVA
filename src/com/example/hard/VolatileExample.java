package com.example.hard;

public class VolatileExample {

    // volatile이 없는 플래그 (비동기적으로 동작하지 않을 수 있음)
    private static boolean stopFlag = false;

    // volatile을 사용한 플래그 (올바르게 동기화됨)
    private static volatile boolean correctFlag = false;

    public static void main(String[] args) throws InterruptedException {
        // 1. 잘못된 동작을 보이는 스레드
        Thread faultyThread = new Thread(() -> {
            int count = 0;
            while (!stopFlag) {
                count++;
            }
            System.out.println("stopFlag로 종료됨. 최종 count: " + count);
        });

        // 2. 올바르게 동작하는 스레드
        Thread correctThread = new Thread(() -> {
            int count = 0;
            while (!correctFlag) {
                count++;
            }
            System.out.println("correctFlag로 종료됨. 최종 count: " + count);
        });

        // 스레드 시작
        faultyThread.start();
        correctThread.start();

        // 1초 후 플래그를 true로 설정하여 스레드 종료 시도
        Thread.sleep(1000);
        stopFlag = true;  // volatile이 없어 바로 반영되지 않을 수 있음
        correctFlag = true;  // volatile이 있어 즉시 반영됨

        // 두 스레드가 종료될 때까지 대기
        faultyThread.join();
        correctThread.join();
    }
}
