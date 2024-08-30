public class Hello2 {

    static int i;
    static{
        i = 500;
        System.out.println("static block");
    }
    //i를 초기화 하고 500으로 다시 초기화하고 print한 뒤 메인 메소드 실행
    //이후 메인 메소드를 찾음, main 메소드도 static하기 때문에 인스턴스 없이 실행 가능
    //결국 static block이 hello보다 먼저 출력이 된다.
    public static void main(String[]args){


        System.out.println("hello");
    }
}

//javac Hello2.java
//jvm이 CLASSPATH에서 Hello2를 찾고 클래스를 읽어 그 정보를 메모리에 올림
//static한 필드나 메소드가 있으면 실행 가능한 상태가 되도록 메모리에 올림
//클래스 필드는 static한 메소드나 필드는 바로 초기화도 되고 static 블록을 통해 초기화도 가능
//java Hello2


