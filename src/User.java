public class User {
    private String name;
    private String email;
    private String pswd;

//    public User(String email, String name) { //생성자, 입력값을 필수로 받는 인스턴스
//        this.email = email;
//        this.name = name;
//        //생성자 하나라도 만들면 기본생성자 만들어주지 않는다.
//    }
//위 생성자와 아래 생성자의 중복되는 역할이 발생함
    public User(String email, String name) { //생성자, 입력값을 필수로 받는 인스턴스
        this(name,email, null);
        //자신의 생성자를 호출하게 하면 코드의 중복을 해결해줌
        //값을 더 많이 받는 생성자들을 이런 식으로 처리하는게 편함.
        //this()생성자라고 부름
        //super 생성자를 제외하면 this()생성자가 항상 맨 윗줄에 있어야 함
    }
    //자신의 생성자를 호출 할 때는 this()를 사용한다
    //1. this는 인스턴스 자기 자신을 참조할 때 사용하는 키워드이다.
    //2. this() 생성자는 자기 자신의 생성자를 말한다.
    //3. this() 생성자는 생성자 안에서만 사용 가능하다.

    public User( String email, String name, String pswd) {
        //이름은 같은데 받는 매개변수가 다르다면? 생성자 오버로딩
        //매개변수의 개수가 다르거나, 타입이 다르다면 여러개 가질 수 있다.

        this.name = name;
        this.email = email;
        this.pswd = pswd;
    }

    //프로퍼티들 제작
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPswd() {
        return pswd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
