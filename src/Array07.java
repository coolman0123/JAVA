public class Array07 {
    public static void main(String[] args){
        int[][] arr1 = {{0,1,2},{3,4,5}};

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.println(arr1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
