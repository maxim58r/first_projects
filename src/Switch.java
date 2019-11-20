import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи свой возраст");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("Ты что только родился?");
                break;
            case 7:
                System.out.println("Тебе пора в школу");
                break;
            case 17:
                System.out.println("Тебе пора в институт");
                break;
            default:
                 System.out.println("Уже никуда не надо");

        }
    }
}
