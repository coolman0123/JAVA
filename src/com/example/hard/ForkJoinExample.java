package com.example.hard;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinExample {

    // 큰 배열에서 병렬로 합계를 계산하는 작업
    static class SumTask extends RecursiveTask<Long> {
        private final int threshold = 1000;  // 임계값
        private int[] arr;
        private int start;
        private int end;

        public SumTask(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            if (end - start <= threshold) {
                // 임계값 이하이면 직접 계산
                long sum = 0;
                for (int i = start; i < end; i++) {
                    sum += arr[i];
                }
                return sum;
            } else {
                // 작업을 두 개로 나누어 병렬로 처리
                int mid = (start + end) / 2;
                SumTask leftTask = new SumTask(arr, start, mid);
                SumTask rightTask = new SumTask(arr, mid, end);

                // 두 하위 작업을 포크
                leftTask.fork();
                long rightResult = rightTask.compute();
                long leftResult = leftTask.join();  // 왼쪽 작업 결과 대기

                // 결과 병합
                return leftResult + rightResult;
            }
        }
    }

    public static void main(String[] args) {
        // 대규모 배열 생성
        int size = 1000000;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i + 1;
        }

        // ForkJoinPool 생성
        ForkJoinPool pool = new ForkJoinPool();

        // 작업 제출
        SumTask task = new SumTask(numbers, 0, numbers.length);
        long result = pool.invoke(task);  // 병렬로 작업 수행

        System.out.println("합계: " + result);  // 출력: 합계: 500000500000
    }
}
