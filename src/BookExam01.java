
public class BookExam01 {
    public static void main(String[] args){
        Book b1 = new Book();
        b1.price = 100;
        System.out.println(b1.price);

        b1.setSecret(1000);
        System.out.println(b1.getSecret());

        b1.setTitle("야호");
        System.out.println(b1.getTitle());
    }
}
