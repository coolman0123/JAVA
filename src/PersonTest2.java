public class PersonTest2 {
    public static void main(String[]args){
        Person p1 = new Person(); //Person이라는 클래스를 찾아 인스턴스를 만든다.
        Person p2 = new Person(); //클래스 정보 자체를 메모리에 올림, 정적인 정보
        //static한 필드를 가지고 있는지 확인 후 클래스 정보를 메모리에 올림
        //count 변수는 인스턴스 별로 가지는 것이 아니라 정적 영역에 별도로 가지고 있다.
        //즉 인스턴스를 만들지 않아도 Person을 Jvm이 읽어 count 변수는 메모리에 올라가 있다.
        p1.name = "시원";
        p2.name = "청군";
        
        System.out.println(Person.count);//이러한 정적인 변수는 이런 식으로 호출하는게 일반적임, static field = 클래스 변수

        System.out.println(p1.name);
        System.out.println(p2.name);
        p1.count++;//p1을 시키든 p2를 시키든 둘 다 count가 증가함
        //JVM은 CLASSPATH에서 class를 찾는다.
        System.out.println(p1.count);
        p2.count++;
        System.out.println(p2.count);

    }
}
