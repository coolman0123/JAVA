public class CommandLineArgumentExam {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("사용법 : CommandLineArgumentExam 값 값 ....");
            System.exit(0); //return; 변경 가능
        }
        for(String arg: args){
            System.out.println(arg);
        }

        //edit config에서 값을 전달하며 파일을 실행한다.
    }
}

/*

Hello.java 파일 작성하고
javac Hello.java 명령 실행후 아무 것도 나오지 않는다?

명령 실행에 성공을 했다는 뜻 -> Unix 철학.
Linux도 Unix 계열이다.

작은 명령들을 조합해서 또 다른 명령을 만든다.(쉘 스크립트 작성)

작은 명령들이 실행되고 종료될때. 제대로 실행되었는지 잘못 실행되었는지 궁금하다.
종료 코드를 정해줌, 그게 System.exit(status: 0);


*/