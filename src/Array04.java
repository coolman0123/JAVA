public class Array04 {
    public static void main(String[] args){
        ItemForArray[] array1;
        ItemForArray array2[];

        array1 = new ItemForArray[5];
        array2 = new ItemForArray[5];

        array1[0] = new ItemForArray(500, "item1");
        array1[1] = new ItemForArray(30000, "itm2");


        System.out.println(array1[0].getName() + array1[0].getPrice());
//        System.out.println(array1[2].getName()); nullpoint 예외
    }
}
