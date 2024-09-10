public class Array01 {

    public static void main(String[] args) {
        int[] array1; //현재까지는 null
        int array2[];
        int array3[];

        array1 = new int[5]; //배열을 선언했으면 반드시 초기화해라.
        array2 = new int[6];
        array3 = new int[0];

        System.out.println(array1.length);
        System.out.println(array2.length);
        System.out.println(array3.length);

    }
}
