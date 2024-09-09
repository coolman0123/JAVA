public class Bus3 extends Car3{
    public Bus3() {
        super("xcx");
        System.out.println("bus 3 기본 생성자.");
    }

    //run이라는 추상메소드를 반드시 구현해줘야 함
    //car3를 상속 받았기 때문에
    //부모가 가진 추상 메소드는 자식에서 반드시 구현을 해줘야 한다.
    @Override
    public void run() {
        System.out.println("후륜구동으로 달린다.");

    }
}
