public class Bus extends Car{
    public void broadcast(){
        System.out.println("백마역");
    }
    public void run(){ //overridng
        System.out.println("버스는 사륜구동");
    }
}
