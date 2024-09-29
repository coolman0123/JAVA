package com.example.hard;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerExample {

    // 공유 자원 (큐)
    private static Queue<Integer> buffer = new LinkedList<>();
    private static final int CAPACITY = 5;  // 버퍼 최대 크기

    // ReentrantLock 및 Condition 변수 사용
    private static Lock lock = new ReentrantLock();
    private static Condition bufferNotFull = lock.newCondition();
    private static Condition bufferNotEmpty = lock.newCondition();

    // 생산자 (Producer)
    static class Producer implements Runnable {
        @Override
        public void run() {
            int value = 0;
            while (true) {
                lock.lock();  // 자원 접근을 위한 락 획득
                try {
                    // 버퍼가 가득 차면 소비자들이 아이템을 소비할 때까지 대기
                    while (buffer.size() == CAPACITY) {
                        System.out.println("버퍼 가득 참. 생산자 대기 중...");
                        bufferNotFull.await();
                    }

                    // 버퍼에 값 추가
                    buffer.add(value);
                    System.out.println("생산자: " + value + " 추가됨.");
                    value++;

                    // 버퍼가 비어 있지 않음을 알림
                    bufferNotEmpty.signalAll();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    lock.unlock();  // 락 해제
                }
            }
        }
    }

    // 소비자 (Consumer)
    static class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                lock.lock();  // 자원 접근을 위한 락 획득
                try {
                    // 버퍼가 비어 있으면 생산자가 아이템을 추가할 때까지 대기
                    while (buffer.isEmpty()) {
                        System.out.println("버퍼 비어 있음. 소비자 대기 중...");
                        bufferNotEmpty.await();
                    }

                    // 버퍼에서 값 제거
                    int value = buffer.poll();
                    System.out.println("소비자: " + value + " 소비됨.");

                    // 버퍼가 가득 차지 않음을 알림
                    bufferNotFull.signalAll();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    lock.unlock();  // 락 해제
                }
            }
        }
    }

    public static void main(String[] args) {
        // 생산자와 소비자 스레드 생성
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        // 스레드 실행
        producerThread.start();
        consumerThread.start();
    }
}

