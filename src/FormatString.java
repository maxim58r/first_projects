public class FormatString {
    public static void main(String[] args) {
        int x = 12345;
        double y = 67.7564748781;
        System.out.printf("String %d\n",x);
        System.out.printf("String %10d\n",x);
        System.out.printf("String %-10d\n",x);
        System.out.printf("String %.5f \n",y);
    }
}
