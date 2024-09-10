public class CarExam {
    public static void main(String[] args){
        Car c2 = new Bus();
        //Car를 상속 받는데 클래스를 만들고 싶진 않다.

        CarAbst c1 = new CarAbst(){

            @Override
            public void a() {
                System.out.println("이름 없는 객체 a() 메소드 오버라이딩");
            }
        };




        c1.a();

    }
}
