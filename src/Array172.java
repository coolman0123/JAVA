import java.util.Arrays;
import java.util.Comparator;

public class Array172 {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("java", 5);
        items[1] = new Item("파이썬", 100);
        items[2] = new Item("c#",  20000);
        items[3] = new Item("c", 5000);
        items[4] = new Item("dart", 5400);


        Arrays.sort(items);
        //sort(object[]) - object는 모든 객체의 조상이라, 어떤 객체의 배열이든 정렬 할 수 있다.


        for(Item item : items){
            System.out.println(item);
        }

        Arrays.sort(items, new ItemSorter()); //정렬 방법 정의 객체

        for(Item item1: items){
            System.out.println(item1);
        }


        //lambda식으로 이름 없는 객체가 들어가도 정렬할 수 있다.
        Arrays.sort(items, (item1, item2) -> item1.getName().compareTo(item2.getName()));


    }



}

class ItemSorter implements Comparator{
    // o1 - o2
    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item)o1;
        Item item2 = (Item)o2;


        return item1.getName().compareTo(item2.getName());
    }
}

//comparable은 어떤 item이 큰지, 작은지 기준을 정하는 interface

class Item implements Comparable{
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Item(String name, int price){
        this.price = price;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Item{name='" + name + "', price=" + price + "}";
    }


    
    // 파라미터로 들어온 object와 내 자신을 비교하는 메소드
    //compareto에는 object를 받아들이도록 했지만, 실제로는 item이 들어온다.
    //홍길동과 고길동 누가 더 크냐?
    //홍이 더 큼 > 앞에서 부터 비교하기 때문에
    //양수가 나오겠네?
//    @Override
//    public int compareTo(Object o) {
//        Item d =(Item)o;
//        return this.name.compareTo(d.name);
//        //변수로 들어온 item 이름과 자기 자신의 이름을 문자열 comparto로 비교해준다.
//        // 양수, 0, 음수
//
//    }
    @Override
    public int compareTo(Object o) {
        Item d =(Item)o;
        return this.price - d.price;



    }
}

