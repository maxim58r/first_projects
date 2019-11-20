import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Введите номер операции:\n1.Сложение  2.Вычитание  3.Умножение 4.Деление: ");
        int operate = scanner1.nextInt();
        if (operate>=1 && operate<=4){

            System.out.print("Введите первое число: ");
            int digitOne = scanner1.nextInt();

            System.out.print("Введите второе число: ");
            int digigTwo = scanner1.nextInt();

                switch (operate) {

                    case 1:
                        System.out.println("Результат сложения ваших чисел равен: "+ (digitOne + digigTwo));
                        break;

                    case 2:
                        System.out.println("Результат вычитания ваших чисел равен: "+ (digitOne - digigTwo));
                        break;

                    case 3:
                        System.out.println("Результат умножения ваших чисел равен: "+ (digitOne * digigTwo));
                        break;

                    case 4:
                        System.out.println("Результат деления ваших чисел равен: "+ (digitOne / digigTwo));
                        break;

                    default:
                        System.out.println("Неизвестная операция");
                }
        }else
            System.out.println("Неизвестная операция");
    }
}
