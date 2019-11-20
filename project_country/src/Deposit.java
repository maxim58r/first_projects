import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float sumDeposit = scanner.nextFloat();

        System.out.print("Введите колличество месяцев: ");
        int numberOfMonth = scanner.nextInt();

        for (int i=0; i<numberOfMonth; i++) {
           sumDeposit += sumDeposit*0.07;
        }
        System.out.printf("После %d месяцев сумма вклада составит %f рублей", numberOfMonth, sumDeposit);
    }
}