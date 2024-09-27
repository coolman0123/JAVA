package com.example.hard;

public class EnumExample {
    public static void main(String[] args) {
        // Enum 사용 예시
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getActivity());  // 각 요일에 맞는 활동 출력
        }
    }
}

// 열거형 선언
enum Day {
    MONDAY("일하기"),
    TUESDAY("운동하기"),
    WEDNESDAY("독서하기"),
    THURSDAY("영화 보기"),
    FRIDAY("친구 만나기"),
    SATURDAY("여행 가기"),
    SUNDAY("휴식");

    private String activity;

    // 생성자
    Day(String activity) {
        this.activity = activity;
    }

    // 해당 요일의 활동을 반환하는 메소드
    public String getActivity() {
        return activity;
    }
}
