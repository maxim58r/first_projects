public class Cycle {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int l = 0;
        int m = 0;

        for (l=0; l<=8; l++){
            System.out.print("*");
        }
        System.out.println("");

        for(i = 0; i<9; i++) {
            System.out.println("^");
            for(j=0; j<i+1; j++) {
                System.out.print("|");
            }


        }

    }
}
