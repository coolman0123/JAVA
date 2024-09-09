public class Car {
    String name;

    //생성자는 메소드와 비슷하다.
    //return type이 없다. 클래스 이름과 같아야 한다.
    public Car(){ //접근제한자 다음 바로 클래스명
        System.out.println("자동차 한대가 생성됨");
        //Car c1 = new Car();
        //직접 car라는 생성자를 만들어준 것
        //생성자가 없을 때는?
        //매개변수가 0개인 생성자를 기본 생성자라고 한다.
        //생성자가 하나도 없으면 아무 일도 안하는 기본 생성자가 자동으로 컴파일시 만들어진다.

    }

    //이름을 가지고 인스턴스가 만들어지게 하고 싶다.
    public Car(String name){
        this.name = name; //인스턴스가 가지는 this.name

    }

    public void printName(){
        System.out.println("name: " + name);
    }

    public void run(){
        System.out.println("전륜으로 달리다");
    }

    @Override
    public String toString() {
        return "자동차";  //toString을 overriding 할 수 있다.
    }

}
