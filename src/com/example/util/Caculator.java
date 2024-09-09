package com.example.util;
//도메인명.project명.패키지명
public class Caculator {
    public int plus(int x, int y){
        return x+y;

    }
    public int minus(int x, int y){
        return x-y;
    }
    public static void main(String[] args){
        Caculator c1 = new Caculator();

        System.out.println(c1.plus(3, 2));
    }
}
