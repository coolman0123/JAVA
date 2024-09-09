public class Book {
    public int price; //field 변수 클래스가 가지는것
    private int secretCode; //여기에 접근하는 메소드를 따로 만들어줘야함, getter / setter

    private String title;

    public int getSecret() {
        return this.secretCode; //내 자신의 인스턴스를 참조한다. 인스턴스 변수, 인스턴스가 있어야 사용가능

    }

    public void setSecret(int secret) { //지역변수 price
        this.secretCode = secret; //매개변수로 받은 지역변수 price로 this.price를 초기화
        //외부로 받은 secret으로 this.secret을 바꿔준다
    }

    //setter, getter를 property라고 함

    //title의 property
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
