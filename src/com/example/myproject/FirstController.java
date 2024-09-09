package com.example.myproject;

import com.example.framework.Controller;

public class FirstController extends Controller {
    @Override
    public void run() {
        System.out.println("1번째 Controller 수행");

    }
//init 메소드를 실수로 오버라이딩 한다면?
    //이런 행위를 막을라면?
    //final 사용 > 오버라이딩을 할 수 없게 만든다.
//    @Override
//    protected void init() {
//        System.out.println("내 맘대로 init");
//
//    }
}
