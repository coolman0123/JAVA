public class MathBeanMain {
    public static void main(String[] args){
        MathBean m1= new MathBean();
        // Heap이라고 불리는 메모리에 올라감 jdk 버전에 따라 heap 메모리 구조도 달라짐

        int result1 =m1.plus(3, 4);
        m1.printClassName();
        m1.printNumber(5000);
        System.out.println(m1.getOne());
        System.out.println(result1);


    }
}
