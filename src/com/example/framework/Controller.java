/*
Controoler의 종류가 여러개이다.
초기화  - 같은 코드
실행  - 다른 코드
마무리  - 같은 코드


*
* */
public abstract class Controller { // 초기화, 종료를 담당하는 controller를 만들어
    public void init(){
        System.out.println("초기화 코드");
    }
    public void close(){
        System.out.println("종료하는 코드");
    }
    public void execute(){
        //초기화
        //실행
        //마무리
    }
}
