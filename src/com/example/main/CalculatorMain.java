package com.example.main;

import com.example.util.Caculator;
import com.example.util2.Calculator;

public class CalculatorMain {
    public static void main(String[] args){
        Caculator c2 = new Caculator(); //import는 위치를 알려주는 것이지, 메모리에 뭔가를 올려주거나 하지는 않는다.
        System.out.println(c2.minus(10, 4));

        Calculator c3 = new Calculator();
        int value = c3.divide(10, 4);
        System.out.println(value);
    }
}
