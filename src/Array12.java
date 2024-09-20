public class Array12 {
    public static void main(String[] args) {
        int[] array = {1,2, 3, 4,5};

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        for(int i : array){
            System.out.println(i);
            // array n번째를 i에 담아서 출력해라
            
        }
    }
}
