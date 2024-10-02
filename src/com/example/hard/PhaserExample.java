package com.example.hard;

import java.util.concurrent.Phaser;

public class PhaserExample {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);  // 주 스레드를 등록
        int numWorkers = 3;

        // 여러 스레드 생성
        for (int i = 0; i < numWorkers; i++) {
            phaser.register();  // 각 스레드를 Phaser에 등록
            new Thread(new Worker(phaser), "작업자-" + i).start();
        }

        // 첫 번째 단계 시작
        System.out.println("모든 작업자 첫 번째 단계 시작");
        phaser.arriveAndAwaitAdvance();  // 모든 스레드가 이곳에 도달할 때까지 대기

        // 두 번째 단계 시작
        System.out.println("모든 작업자 두 번째 단계 시작");
        phaser.arriveAndAwaitAdvance();  // 모든 스레드가 이곳에 도달할 때까지 대기

        // 세 번째 단계 시작
        System.out.println("모든 작업자 세 번째 단계 시작");
        phaser.arriveAndAwaitAdvance();  // 모든 스레드가 이곳에 도달할 때까지 대기

        // 모든 작업 완료
        phaser.arriveAndDeregister();  // 주 스레드를 Phaser에서 해제
        System.out.println("모든 작업 완료");
    }

    // 작업자 스레드
    static class Worker implements Runnable {
        private Phaser phaser;

        Worker(Phaser phaser) {
            this.phaser = phaser;
        }

        @Override
        public void run() {
            for (int phase = 0; phase < 3; phase++) {
                System.out.println(Thread.currentThread().getName() + " 단계 " + phase + " 작업 중...");
                phaser.arriveAndAwaitAdvance();  // 각 단계에서 대기
            }
            phaser.arriveAndDeregister();  // 모든 작업 완료 후 등록 해제
        }
    }
}
