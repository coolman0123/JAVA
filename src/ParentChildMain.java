public class ParentChildMain {
    public static void main(String[] args){
        Child c1 = new Child();
        System.out.println(c1.i); //15
        c1.printI();//15
        System.out.println("----------------------");
        Parent p1 = new Parent();
        System.out.println(p1.i); //5
        p1.printI();// 5
        System.out.println("----------------------");

        Parent p2 = new Child(); //child가 parent의 자식이다.  type = Parent임 필드는 type따라감
        System.out.println(p2.i); //필드는 부모의 필드를 따라가나 봄 5, 이런 식의 p2.i같은 필드를 직접 접근해서는 안됨, 정보 은닉 필요
        p2.printI(); //메서드는 자식의 메서드를 따라간다. 15
        p2.printII(); // 부모 i = 5 >> 연산 10출력
        

    }
}
