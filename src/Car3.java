public abstract class Car3 {
    public Car3(String name){
        super();

        System.out.println("Car() 생성자가 호출");

    }

    //추상메소드.
    //구현이 안되어 있고 선언만 된 메소드
    //car3를 만든 사람은 run()이라는 메소드가 필요하다고 생각함.
    //run()은 자동차마다 다르게 구현할 것 같아.
    public abstract void run();//선언만 해줘
}
