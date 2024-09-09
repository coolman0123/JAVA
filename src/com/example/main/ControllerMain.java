package com.example.main;

import com.example.framework.Controller;
import com.example.myproject.FirstController;

public class ControllerMain {
    public static void main(String[] args){
        Controller c1 = new FirstController();
        c1.execute(); // First controller에서 구현한 run이 반영되어 템플릿 메소드 실행

    }
}
