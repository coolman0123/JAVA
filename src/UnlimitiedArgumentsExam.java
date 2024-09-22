
public class UnlimitiedArgumentsExam {

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(5, 10));
        System.out.println(sum(1, 2, 4, 2));
        System.out.println(sum(3, 1, 2, 3, 4,1 ));

    }

    public static int sum(int... args){ //...은 제한 없는 argument 문법 -> 정수를 여러개 받을 수 있다는 뜻
        System.out.println("print1 메소드 - args 길이:" + args.length);
        int sum = 0;

        for(int i = 0; i < args.length; i++){
            sum += args[i];

        }

        return sum;
    }
}
