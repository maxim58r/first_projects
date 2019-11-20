public class Population {
    public static void main(String[] args) {
        int population = 10000000;
        System.out.println("Было населения в 1999 году: "+population+ " человек.");
        int born = 14; //7
        int death = 8; //6

        for (int i=0; i<10; i++){
            if (born>7) {born--;
            }else born=7;
            if (death>6) { death--;
            }else death=6;

            int dif = born-death;
            population += population*dif/1000;
            System.out.printf("Стало населения в 200%d году: %d человек.\n", i, population);
        }
    }
}

