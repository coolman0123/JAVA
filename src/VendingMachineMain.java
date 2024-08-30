public class VendingMachineMain {
    public static void main(String[] args){ // main 메소드
        VendingMachine machine1 = new VendingMachine(); //인스턴스를 생성한다.
        //machine1 인스턴스(new VendingMache())를 참조하는 참조 변수
        //VendingMachinemain 메소드는 vendingMachine 클래스에 의존한다.
        //메소드 안에서 사용되는 것들은 다 의존하는 것들이다.
        //VendingMachinemain은 string이라는 클래스에도 의존함
        VendingMachine machine2 = new VendingMachine();

        String product1 = machine1.pushProductButton(2);
        System.out.println(product1);
        VendingMachine.printVersion(); //static한 메소드는 바로 이용할 수 있다. class.method

        String product2 = machine2.pushProductButton(3);
        System.out.println(product2);
    }
}
