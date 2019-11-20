public class Multidimensional_Arrays_1 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5},{45,78,5,44},{0,9,8}};
        for (int i=0; i<matrix.length; i++){
            for (int l=0; l<matrix[i].length; l++) {
                System.out.print(matrix[i][l] + " ");
            }
            System.out.println();
        }
    }
}
