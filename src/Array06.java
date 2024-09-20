public class Array06 {
    public static void main(String[] args) {
        int[][] array1 = new int[2][2];

        array1[0][0] = 0;
        array1[0][1] = 1;
        array1[1][0] = 2;
        array1[1][1] = 3;

        for(int i = 0; i<2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println(array1[i][j] + "\t");
            }
        }

    }
}
