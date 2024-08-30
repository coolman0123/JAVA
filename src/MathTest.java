public class MathTest {
    public static void main(String[] args){
        int value = Math.abs(-5);
        System.out.println(value);

//        Math m = new Math(); private한 메소드이기 때문에 인스턴스 생성 불가
        //math라는 클래스는 인스턴스를 못만들게 해야지 new할 때마다 메모리에 인스턴스가 만들어지니까 자원이 아까움
        //그냥 호출해서 사용하게 만들어. 생성자를 private하게 만들었음

    }
}
