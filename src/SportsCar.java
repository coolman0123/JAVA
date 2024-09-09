public class SportsCar extends Car3{
    //부모가 기본생성자가 없기 때문에 반드시 super()를 통해 호출한다.
    public SportsCar(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("정말 빠르게 달린다.");
    }
}
