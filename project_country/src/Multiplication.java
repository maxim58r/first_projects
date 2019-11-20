import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int enterNumber =0;
        do {
            System.out.print("Введите первое число: ");
            int digitOne = scanner1.nextInt();
            System.out.print("Введите второе число: ");
            int digigTwo = scanner1.nextInt();

            System.out.printf("Результат умножения числа %d на число %d равен: %d\n\n"
                    ,digitOne, digigTwo, digitOne * digigTwo);
            System.out.print("Вы хотите завершить? \nЕсли да то введите цифру: 1\n" +
                    "Если нет то введите любую цифру.\nВведите цифру: ");
            enterNumber = scanner1.nextInt();
        }  while (enterNumber !=1);
    }
}
