package com.example.hard;

import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // 리플렉션을 사용해 클래스를 동적으로 로드하고 정보 출력
        Class<?> clazz = Class.forName("Person");
        Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
        Object obj = constructor.newInstance("홍길동", 25);

        // 메소드 호출
        Method method = clazz.getMethod("introduce");
        method.invoke(obj);  // 출력: 제 이름은 홍길동이고, 나이는 25살입니다.
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // introduce 메소드
    public void introduce() {
        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
    }
}
