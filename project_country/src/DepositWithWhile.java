import java.util.Scanner;

public class DepositWithWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float sumDeposit = scanner.nextFloat();

        System.out.print("Введите колличество месяцев: ");
        int numberOfMonth = scanner.nextInt();
        int i =numberOfMonth;

        while (i >0){
            sumDeposit += sumDeposit*0.07;
            i--;
        }
        System.out.printf("После %d месяцев сумма вклада составит %f рублей", numberOfMonth, sumDeposit);
    }
}
