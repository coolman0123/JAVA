public class UserExam {
    public static void main(String[] args){
        User user1 = new User("socoo@mail.com","csw");

        //System.out.println(user.name); private하게 접근제한을 했기 때문에 에러 발생

        System.out.println(user1.getName());
        System.out.println(user1.getEmail());
        //get으로는 user의 이름이나 정보를 바꿀 수 없다.
        //생성자의 값을 리턴만 하는 기능이 있다면 불변 객체라고 부른다.
        //setter가 필요함
        System.out.println("-----------------------");
        User user2 = new User("socoo@naver.com", "csw22", "1234");
        System.out.println(user2.getEmail());
        System.out.println(user2.getName());
        System.out.println(user2.getPswd());

        System.out.println(user2);
    }
}
