public class CarTest1 {
    public static void main(String[] args){
        Bus b1 = new Bus();
        b1.run();
        b1.broadcast();
        b1.name = "광역";

        Car c1 = new Bus(); //버스는 자동차이다. car의 메소드만 사용할 수 있음. bus 메소드는 불가
        c1.run(); //bus에서 오버라이딩된 메서드는 오버라이딩된 상태로 출력해야 됨. 무조건 자식 메소드가 실행된다.
        //c1.broadcast()는 사용할 수 없다.
        
        SuperCar s1 = new SuperCar();
        s1.run();
        Car c2 = new Car();
        c2.run();

        Bus b2 = (Bus)c1; // c1이 bus를 참조해서 bus로 만들어라
        b2.broadcast(); //broadcast메서드 사용 가능해짐
    }
}
