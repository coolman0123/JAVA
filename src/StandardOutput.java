public class StandardOutput {
    public void println(boolean b){
        System.out.println(b);
    }
    public void println(int i){
        System.out.println(i);
    }
    public void println(String s){
        System.out.println(s);
    }

    public void println(double d){ //인스턴스 메소드는 실행 가능하도록 올라가지 않는다.
        //main을 한줄 한줄 실행
        System.out.println(d);
    }
    //메소드 이름은 같은데 받는 타입은 다 다르다. = 오버로딩

    public static void main(String[] args){ //static은 실행 가능하도록 메모리에 올라감
        StandardOutput o1 = new StandardOutput();
        o1.println(100);
        o1.println("hello");
        o1.println(10.5);
        o1.println(false);
        //각자 맞는 형식의 메소드를 통해 출력된다.

    }
}
