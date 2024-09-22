import java.util.Arrays;
public class Array16 {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 3,4 ,5};
        int[] array2 = {4,2,3,4,5};

        int compare = Arrays.compare(array1, array2);
        //비교 메서드 양수, 0, 음수
        // 양수면 >
        // 0이면 같음
        // 음수면 <

        //원소의 개수가 많은 쪽이 더 크고, 배열의 각 요소 비교도 함
        System.out.println(compare);
    }
}
