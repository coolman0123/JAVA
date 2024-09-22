public class EmptyCommandLineArgumentExam {
    public static void main(String[] args) {
        System.out.println(args.length);
    }
}

//String[] args = new String[0];
//main(args);


//javac 파일명.java
//java 파일명

//edit configurations에서 program argument를 수정한다면, args에 값을 넘길 수 있다.
//java EmptyCommandLineArgumentExam a b c d e hello

//java -javaagent: 어떤 설정  EmptyCommandLineArgumentExam a b c
//java와 클래스명 사이에는 jvm에게 직접 줄 수 있는 옵션을 입력할 수 있다.