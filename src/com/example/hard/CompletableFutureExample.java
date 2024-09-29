package com.example.hard;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {

    public static void main(String[] args) {
        // 첫 번째 비동기 작업: API 호출을 시뮬레이션
        CompletableFuture<String> apiCall = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);  // 2초 대기
                System.out.println("API 호출 완료");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "API 결과";
        });

        // 두 번째 비동기 작업: 데이터 처리
        CompletableFuture<String> dataProcessing = apiCall.thenApply(result -> {
            System.out.println("데이터 처리 시작: " + result);
            try {
                TimeUnit.SECONDS.sleep(1);  // 1초 대기
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "처리된 " + result;
        });

        // 세 번째 작업: 두 가지 비동기 작업 완료 후 최종 결과 출력
        CompletableFuture<Void> finalResult = dataProcessing.thenAccept(result -> {
            System.out.println("최종 결과: " + result);
        });

        // 모든 작업이 완료될 때까지 대기
        try {
            finalResult.get();  // 완료되기 전까지 블로킹
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
