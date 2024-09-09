public class CarTest02 {
    public static void main(String[] args){
        Car c1 = new Car();
        System.out.println(c1); //object로서 c1을 받아줌 println(Object x)

        c1.printName(); //null임
        Car c2 = new Car("csw");

        c2.printName();


    }
}
//부모 타입의 변수로 자식 인스턴스를 참조할 수 있다.
//조상 타입의 변수로 후손 인스턴스를 참조할 수 있다.

//Car c1 = new Bus(); //버스는 car의 자손이다.
//Object o1 = new Car(); 오류 발생 없음

//System.out.println(c1); = System.out.println(c1.toString());