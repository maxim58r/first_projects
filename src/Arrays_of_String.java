public class Arrays_of_String {
    public static void main(String[] args) {

        String[] strings = new String[3];
        strings[0] = "Привет";
        strings[1] = "Java!";
        strings[2] = "Как дела?";

        for (int i= 0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
        for (String x:strings) {
            System.out.println(x + " " +1);
        }
        int[] numbers = {10,11,12,13,14};
        int sum = 0;
        for (int number:numbers){
            sum+=number*2;
            System.out.println(sum);
        }
        System.out.println();
        System.out.println(sum);

    }
}
