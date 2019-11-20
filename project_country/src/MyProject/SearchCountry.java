package MyProject;

import java.util.Scanner;

public class SearchCountry {
    private static Scanner a;

    public static void main(String[] args) {
        System.out.print("Введите название страны или столицы или несколько первых букв: ");
        a  = new Scanner(System.in);
        InputCheck f = new InputCheck(); // проверка на правильность ввода
        f.inputLine(a);
    }
}