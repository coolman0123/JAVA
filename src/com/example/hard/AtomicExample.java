package com.example.hard;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    // AtomicInteger 사용
    private static AtomicInteger atomicCount = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        // 1000개의 스레드 생성
        Thread[] threads = new Thread[1000];

        // 각 스레드가 100번씩 atomicCount 값을 증가시킴
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    atomicCount.incrementAndGet();  // 원자적으로 값을 증가시킴
                }
            });
            threads[i].start();  // 스레드 시작
        }

        // 모든 스레드가 종료될 때까지 대기
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("최종 카운트 값: " + atomicCount.get());  // 출력: 최종 카운트 값: 100000
    }
}
