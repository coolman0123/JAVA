package com.example.hard;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturePipelineExample {

    public static void main(String[] args) {
        CompletableFuture<Void> futurePipeline = CompletableFuture.supplyAsync(() -> {
            System.out.println("1단계: 데이터 가져오기");
            return fetchData();  // 데이터를 가져옴
        }).thenApply(data -> {
            System.out.println("2단계: 데이터 처리");
            return processData(data);  // 데이터를 처리함
        }).thenAccept(result -> {
            System.out.println("3단계: 처리된 데이터 출력");
            System.out.println("결과: " + result);  // 결과 출력
        }).exceptionally(ex -> {
            System.out.println("예외 발생: " + ex.getMessage());
            return null;  // 예외 처리
        });

        // 모든 비동기 작업이 완료될 때까지 대기
        try {
            futurePipeline.get();  // CompletableFuture 완료 대기
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    // 1단계: 데이터를 가져오는 함수 (Exception 발생 가능)
    private static String fetchData() {
        // 예외 발생 시뮬레이션
        if (Math.random() > 0.7) {
            throw new RuntimeException("데이터 가져오기 실패");
        }
        return "원본 데이터";
    }

    // 2단계: 데이터를 처리하는 함수
    private static String processData(String data) {
        return "처리된 " + data;
    }
}
