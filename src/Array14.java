
public class Array14 {
    public static void main(String[] args) {

        int[] copyFrom = {1, 2, 3};
        int[] copyTo = java.util.Arrays.copyOf(copyFrom, copyFrom.length);

        for(int i: copyTo){
            System.out.println(i);
        }
        System.out.println("-------------------------");
        int[] copyTo2 = java.util.Arrays.copyOf(copyFrom, 5);
        // 길이를 초과하게 copy한다면 0값을 받게 함
        for(int j: copyTo2){
            System.out.println(j);
        }

        int[] copyTo3 = copyFrom;
        // 1과 3은 뭐가 다를까?
        // 3이라면 같은 걸 참조한다는 뜻임 copyFrom == copyTo3
        // 1은? 새로운 배열을 만들어서 copyTo가 참조시킴 메모리 속에서는 각자 다른 배열인거다.
        System.out.println("-------------------------");
        for(int c : copyTo3){
            System.out.println(c);
        }

        //for each는 배열 내에 모든 값을 꺼내올 때 편리하기 때문이다.

    }
}
