package com.example.framework;

/*
Controoler의 종류가 여러개이다.
초기화  - 같은 코드
실행  - 다른 코드  >> 실행 코드만 항상 다르다.
마무리  - 같은 코드

if 사용자가 초기화하는 init() 코드만 실행한다면?
사용하지 못하게 막아야 됨
=> protected를 사용하자
*
* */
public abstract class Controller { // 초기화, 종료를 담당하는 controller를 만들어
    protected final void init(){
        //protected는 같은 package 이거나 상속받았을 경우 접근 가능하다.
        System.out.println("초기화 코드");
    }
    public final void close(){
        System.out.println("종료하는 코드");
    }
    protected abstract void run();

    //내가 가지고 있는 메소드를 호출한다.
    //어떤 순서 형식을 가지고 있는 이러한 메소드를 템플릿 메소드라고 한다.
    public void execute(){
        this.init();//초기화
        this.run();//실행
        this.close(); //마무리
    }
}
