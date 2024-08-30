public class Person {
    String name; //인스턴스 필드 (static 없음)
    String address;
    int isVip;

    static int count = 0; //클래스 필드

    static { //클래스 필드는 static 블록 내에서 초기화가 가능하다.
        count = 100;
    }

    public void printName(){ //인스턴스 메소드. 인스턴스가 생성되어야 사용할 수 있는 메소드
        System.out.println("내 이름은?" + name);
    }
    public static void printCount(){//인스턴스가 없이 이용할 수 있는 class 메소드
        //System.out.println(name); 가능?
        //불가능함 static한 메소드는 인스턴스 필드나, 인스턴스 메소드 사용할 수 없음
        //메모리의 생성되는 시점이 다름, static한 메소드가 사용하는 시점에는 인스턴스 필드는 메모리에 없으니까

        System.out.println("count :" +count);
    }
}
