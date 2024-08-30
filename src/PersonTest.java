public class PersonTest {
    public static void main(String[] args){
        Person p1; //p1은 null이다.
        Person p2 = new Person();

        System.out.println(p2.name); //null
        System.out.println(p2.address); //null
        System.out.println(p2.isVip); //false

        Person p3 = new Person();
        p3.name = "siwon"; //문자열은 new를 사용하지 않고 인스턴스를 사용할 수 있음.
        System.out.println(p3.name);
        System.out.println(p3.name.length());

        System.out.println("--------------------------");
        p2.printMethod();

    }
}
