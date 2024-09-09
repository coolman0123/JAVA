public class Car3Exam {
    public static void main(String[] args){
        // Car3 c1 = new Car3("ccc");  추상클래스는 인스턴스가 될 수 없다.

        Bus3 b1 = new Bus3();
        b1.run();
        SportsCar s1 = new SportsCar("avante");
        s1.run();

        Car3 c =  new SportsCar("Ss");
        c.run(); //c new class, 어떤 인스턴스가 어떤 인스턴스를 참조하는지 모른다면.
        //실행되게 전까지 run 메소드의 결과를 알 수 는 없다. 실행되는 상황에서 결과를 알 수 있는 언어를 동적인 언어라고 말함.


        System.out.println("---------------------");
        Car3[] array = new Car3[2]; //car3 2개 참조할 수 있는 배열 선언
        array[0] = new Bus3(); // 0번째는 bus3 참조
        array[1] = new SportsCar("sports car"); //1번째는 sportscar 참조


        for(Car3 c3: array){
            c3.run();
        }


    }
}
