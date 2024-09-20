public class Array08 {
    public static void main(String[] args){
        int[][] array1 = new int[2][3];
        array1[0][0] = 0;
        array1[0][1] = 1;
        array1[0][2] = 2;
        array1[1][0] = 3;
        array1[1][1] = 4;
        array1[1][2] = 5;

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array1[i].length; j++){
                System.out.println(array1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
