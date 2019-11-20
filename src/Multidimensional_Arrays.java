public class Multidimensional_Arrays {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5},{45,78,5,44},{0,9,8}};
        System.out.println(matrix[0][3]);
        System.out.println(matrix[2][1]);
        System.out.println(matrix[1][0]);

        String[][] strings = new String[6][9];
        strings[5][8] = "Как здрасте";
        System.out.println(strings[5][8]);
        System.out.println(strings[4][8]);
        System.out.println(strings[5][0]);
    }
}
