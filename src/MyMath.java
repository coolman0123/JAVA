public class MyMath {
    //자동 생성 - 기본생성자는 생성자가 없을 경우 컴파일할 때 자동으로 생성된다.
    public  MyMath(){} //이런 형태로 자동 생성, 생성자를 안 만든 경우에
    //public이 아니라 private라면 생성자를 만들 수 가 없다. static한 메소드만 실행시키게 해야 할 때 사용

    public static int abs(int x){
        if(x > 0){
            return x;
        }else {
            return -x;
        }
    }
}
