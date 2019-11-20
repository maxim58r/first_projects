public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i=1; i < numbers.length; i++){
            numbers[i] = i*9-3;
        }
        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            System.out.println(i);
        }
        System.out.println();
        int[] numbers1 = {12,3,213,21,4,45};
        for (int i=0; i<numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
    }
}
