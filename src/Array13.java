public class Array13 {
    public static void main(String[] args) {
        ItemForArray[] array = new ItemForArray[3];
        array[0] = new ItemForArray(500, "사과");
        array[1] = new ItemForArray(1000, "아보카도");
        array[2] = new ItemForArray(2000, "수박");

        for(ItemForArray item: array){
            System.out.println(item.getPrice());
            System.out.println(item.getName());

        }
    }

}
